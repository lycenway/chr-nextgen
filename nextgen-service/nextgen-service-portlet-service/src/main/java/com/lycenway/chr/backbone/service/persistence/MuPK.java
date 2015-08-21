package com.lycenway.chr.backbone.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author lycenway
 * @generated
 */
public class MuPK implements Comparable<MuPK>, Serializable {
    public String hkey;
    public long muId;

    public MuPK() {
    }

    public MuPK(String hkey, long muId) {
        this.hkey = hkey;
        this.muId = muId;
    }

    public String getHkey() {
        return hkey;
    }

    public void setHkey(String hkey) {
        this.hkey = hkey;
    }

    public long getMuId() {
        return muId;
    }

    public void setMuId(long muId) {
        this.muId = muId;
    }

    @Override
    public int compareTo(MuPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        value = hkey.compareTo(pk.hkey);

        if (value != 0) {
            return value;
        }

        if (muId < pk.muId) {
            value = -1;
        } else if (muId > pk.muId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MuPK)) {
            return false;
        }

        MuPK pk = (MuPK) obj;

        if ((hkey.equals(pk.hkey)) && (muId == pk.muId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(hkey) + String.valueOf(muId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("hkey");
        sb.append(StringPool.EQUAL);
        sb.append(hkey);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("muId");
        sb.append(StringPool.EQUAL);
        sb.append(muId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
