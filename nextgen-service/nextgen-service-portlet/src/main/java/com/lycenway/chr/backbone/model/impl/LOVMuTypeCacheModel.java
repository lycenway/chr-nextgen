package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lycenway.chr.backbone.model.LOVMuType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LOVMuType in entity cache.
 *
 * @author lycenway
 * @see LOVMuType
 * @generated
 */
public class LOVMuTypeCacheModel implements CacheModel<LOVMuType>,
    Externalizable {
    public String code;
    public String title;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{code=");
        sb.append(code);
        sb.append(", title=");
        sb.append(title);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public LOVMuType toEntityModel() {
        LOVMuTypeImpl lovMuTypeImpl = new LOVMuTypeImpl();

        if (code == null) {
            lovMuTypeImpl.setCode(StringPool.BLANK);
        } else {
            lovMuTypeImpl.setCode(code);
        }

        if (title == null) {
            lovMuTypeImpl.setTitle(StringPool.BLANK);
        } else {
            lovMuTypeImpl.setTitle(title);
        }

        lovMuTypeImpl.resetOriginalValues();

        return lovMuTypeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        code = objectInput.readUTF();
        title = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (code == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(code);
        }

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }
    }
}
