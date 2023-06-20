package com.simonking.common.framework.handler;

import com.simonking.common.framework.JsonResult;
import com.simonking.common.framework.exception.BizException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.Optional;


/**
 * 全局异常处理器
 *
 * @author: ws
 * @date: 2023/6/17 15:00
 */
@RestControllerAdvice
@Slf4j
public class GlobalControllerHandler {
    
    /**
     * 自定义异常的处理
     *
     * @author ws
     * @date 2023/6/19 11:29
     * @param e
     * @return {@link JsonResult<?>}
     */
    @ExceptionHandler(BizException.class)
    public JsonResult<?> bizExceptionHandler(BizException e){
        log.warn("[自定义异常信息-Exception][业务系统：{}]", e.getBizEnum().getBizName(), e);
        return JsonResult.fail(e.getMessage());
    }

    /**
     * validation 绑定参数异常处理
     *
     * @author ws
     * @date 2023/6/19 12:30
     * @param e
     * @return {@link JsonResult<?>}
     */
    @ExceptionHandler(BindException.class)
    public JsonResult<?> bindExceptionHandler(BindException e){
        log.warn("[参数校验绑定异常-BindException]", e);
        FieldError fieldError = e.getBindingResult().getFieldError();
        String msg = Optional.ofNullable(fieldError).map(FieldError::getDefaultMessage).orElse(e.getMessage());
        return JsonResult.fail(msg);
    }

    /**
     * validation 参数校验异常处理
     *
     * @author ws
     * @date 2023/6/19 12:30
     * @param e
     * @return {@link JsonResult<?>}
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public JsonResult<?> bindExceptionHandler(MethodArgumentNotValidException  e){
        log.warn("[参数校验异常-MethodArgumentNotValidException]", e);
        FieldError fieldError = e.getBindingResult().getFieldError();
        String msg = Optional.ofNullable(fieldError).map(FieldError::getDefaultMessage).orElse(e.getMessage());
        return JsonResult.fail(msg);
    }

    /**
     * 其他异常，也是兜底异常，没有定义的异常全部通过该异常捕获
     *
     * @author ws
     * @date 2023/6/19 12:48
     * @param e
     * @return {@link JsonResult<?>}
     */
    @ExceptionHandler(Exception.class)
    public JsonResult<?> exceptionHandler(Exception e){
        log.warn("[全局异常-Exception]", e);
        return JsonResult.fail(e.getMessage());
    }


    /**
     * 表单提交的日期格式处理
     *
     * @author ws
     * @date 2023/6/19 12:48
     * @param binder
     */
    @InitBinder
    public void globalWebDataBinder(WebDataBinder binder){
        DateFormatter dateFormatter = new DateFormatter("yyyy-MM-dd");
        String[] patterns = {"yyyy/MM/dd", "yyyyMMdd", "yyyy-MM-dd HH:mm:ss"};
        dateFormatter.setFallbackPatterns(patterns);
        binder.addCustomFormatter(dateFormatter, Date.class);
    }
}
