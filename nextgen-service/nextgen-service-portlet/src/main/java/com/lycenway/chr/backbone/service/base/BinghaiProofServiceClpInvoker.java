package com.lycenway.chr.backbone.service.base;

import com.lycenway.chr.backbone.service.BinghaiProofServiceUtil;

import java.util.Arrays;

/**
 * @author lycenway
 * @generated
 */
public class BinghaiProofServiceClpInvoker {
    private String _methodName62;
    private String[] _methodParameterTypes62;
    private String _methodName63;
    private String[] _methodParameterTypes63;

    public BinghaiProofServiceClpInvoker() {
        _methodName62 = "getBeanIdentifier";

        _methodParameterTypes62 = new String[] {  };

        _methodName63 = "setBeanIdentifier";

        _methodParameterTypes63 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName62.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes62, parameterTypes)) {
            return BinghaiProofServiceUtil.getBeanIdentifier();
        }

        if (_methodName63.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes63, parameterTypes)) {
            BinghaiProofServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
