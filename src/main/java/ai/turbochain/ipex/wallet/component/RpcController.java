package ai.turbochain.ipex.wallet.component;

import java.math.BigDecimal;

import ai.turbochain.ipex.wallet.util.MessageResult;

public interface RpcController {
    /**
     * 获取当前区块高度
     * @return
     */
    MessageResult blockHeight();

    MessageResult getNewAddress(String uuid);

    MessageResult withdraw(String toAddress, BigDecimal amount, BigDecimal fee,Boolean isSync,String withdrawId);

    MessageResult transfer();

    MessageResult balance();
}
