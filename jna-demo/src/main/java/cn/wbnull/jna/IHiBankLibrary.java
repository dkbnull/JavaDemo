package cn.wbnull.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * DLL接口
 *
 * @author dukunbiao(null)  2019-12-18
 */
public interface IHiBankLibrary extends Library {

    IHiBankLibrary INSTANCE = Native.loadLibrary("E:\\JavaDemo\\jna-demo\\data\\HiBankW64.dll", IHiBankLibrary.class);

    /**
     * function CreditTransABC(strIn, StrOut:pChar):Integer; stdcall;
     */
    int CreditTransABC(String strIn, byte[] strOut);
}
