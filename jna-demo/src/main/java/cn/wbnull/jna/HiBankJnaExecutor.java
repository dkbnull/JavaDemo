package cn.wbnull.jna;

import java.nio.charset.StandardCharsets;

/**
 * 调用 DLL接口
 *
 * @author dukunbiao(null)  2019-09-18
 */
public class HiBankJnaExecutor {

    public void creditTransABC() {
        byte[] strOut = new byte[1024];

        IHiBankLibrary.INSTANCE.CreditTransABC("1", strOut);
        String result = new String(strOut, StandardCharsets.UTF_8).trim();
        System.out.println(result);
    }
}
