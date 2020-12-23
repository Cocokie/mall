package com.lix.mall.common.exception;

import com.lix.mall.common.utils.R;
import com.lix.mall.common.utils.ResultEnum;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R validException(MethodArgumentNotValidException e) {
        BindingResult bindingResult = e.getBindingResult();
        Map m = new HashMap<>();
        bindingResult.getFieldErrors().forEach(fieldError -> {
            m.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return R.error(ResultEnum.PARAMS_ERROR.getCode(), ResultEnum.PARAMS_ERROR.getMessage()).put("data", m);

    }

    @ExceptionHandler(value = Exception.class)
    public R AllException(Exception e) {

        return R.error(ResultEnum.UNKNOW_ERROR.getCode(), ResultEnum.UNKNOW_ERROR.getMessage()).put("data",e.getMessage());

    }
}
