package ai.turbochain.ipex.wallet.util;

import ai.turbochain.ipex.wallet.entity.Account;

public interface AccountReplayListener {

    void replay(Account account);
}
