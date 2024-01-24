package com.team5.projrental.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.team5.projrental.common.exception.ErrorMessage;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ChangeUserDto {

    @Length(max = 20, message = ErrorMessage.ILLEGAL_RANGE_EX_MESSAGE)
    private String nick;

    //private MultipartFile pic;
    //private String pushpic;
    private MultipartFile pic;

    @Length(min = 8, max = 20, message = ErrorMessage.ILLEGAL_RANGE_EX_MESSAGE)
    private String upw;

    @Pattern(regexp = "(01)\\d-\\d{3,4}-\\d{4}", message = ErrorMessage.BAD_INFO_EX_MESSAGE)
    private String phone;

    private String addr;

    private String restAddr;

    private long compCode;
    private String compNm;

    @Pattern(regexp = "\\w+@\\w+\\.\\w+(\\.\\w+)?", message = ErrorMessage.BAD_INFO_EX_MESSAGE)
    private String email;

    @JsonIgnore
    private String chPic;
    @JsonIgnore
    private int iuser;
    @JsonIgnore
    private double x;
    @JsonIgnore
    private double y;
}
