package com.team5.projrental.common.exception;

import lombok.Getter;

@Getter
public enum ErrorStatus {
    ILLEGAL_EX_MESSAGE(499),
    ILLEGAL_PRODUCT_PICS_EX_MESSAGE(498),
    ILLEGAL_CATEGORY_EX_MESSAGE(497),
    ILLEGAL_PAYMENT_EX_MESSAGE(496),
    //
    BUY_DATE_MUST_BE_LATER_THAN_TODAY_EX_MESSAGE(489),
    RENTAL_DATE_MUST_BE_BEFORE_THAN_TODAY_EX_MESSAGE(488),
    RENTAL_END_DATE_MUST_BE_AFTER_THAN_RENTAL_START_DATE_EX_MESSAGE(487),
    //
    NO_SUCH_USER_EX_MESSAGE(479),
    NO_SUCH_PRODUCT_EX_MESSAGE(478),
    NO_SUCH_PAYMENT_EX_MESSAGE(477),
    NO_SUCH_PASSWORD_EX_MESSAGE(476),
    NO_SUCH_ID_EX_MESSAGE(475),
    //
    BAD_ADDRESS_INFO_EX_MESSAGE(469),
    BAD_INFO_EX_MESSAGE(468),
    BAD_SORT_EX_MESSAGE(467),
    BAD_RENTAL_DEL_EX_MESSAGE(466),
    BAD_RENTAL_CANCEL_EX_MESSAGE(465),
    BAD_DIV_INFO_EX_MESSAGE(464),
    BAD_PIC_EX_MESSAGE(463),
    BAD_ID_EX_MESSAGE(462),
    //
    ALL_INFO_NOT_EXISTS_EX_MESSAGE(459),
    //
    SERVER_ERR_MESSAGE(500);


    private int code;

    ErrorStatus(int code) {
        this.code = code;
    }

}