package subsystem;

import common.exception.PaymentException;
import common.exception.UnrecognizedException;
import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;
/**
 * NguyenVanDuong-20173069
 * */
public class MBBank implements InterbankInterface  {

	@Override
	public PaymentTransaction payOrder(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentTransaction refund(CreditCard card, int amount, String contents)
			throws PaymentException, UnrecognizedException {
		// TODO Auto-generated method stub
		return null;
	}

}
