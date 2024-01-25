package com.team5.projrental.payment;

import com.team5.projrental.payment.model.PaymentInsDto;
import com.team5.projrental.payment.model.proc.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class PaymentRepository {

    private final PaymentMapper paymentMapper;

    //
    public List<GetDepositAndPriceFromProduct> getValidationInfoFromProduct(int iproduct) {
        return paymentMapper.getValidationInfoFromProduct(iproduct);
    }
    //

    public int savePayment(PaymentInsDto paymentInsDto) {
        return paymentMapper.insPayment(paymentInsDto);
    }

    public int saveProductPayment(Integer iproduct, Integer ipayment) {
        return paymentMapper.insProductPayment(iproduct, ipayment);
    }

    public GetInfoForCheckIproductAndIuserResult checkIuserAndIproduct(Integer ipayment) {
        return paymentMapper.checkIuserAndIproduct(ipayment);

    }

    public int deletePayment(DelPaymentDto delPaymentDto) {

        return paymentMapper.delPayment(delPaymentDto);
    }

    public List<GetPaymentListResultDto> findPaymentBy(GetPaymentListDto getPaymentListDto) {
        return paymentMapper.getPaymentList(getPaymentListDto);
    }

   public int updateStatusIfOverRentalEndDate(LocalDate now) {
        return paymentMapper.updateIstatusOverRentalEndDate(now);
    }

}
