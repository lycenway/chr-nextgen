package com.lycenway.chr.backbone.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.lycenway.chr.backbone.model.LOVBinghaiLeixing;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LOVBinghaiLeixing in entity cache.
 *
 * @author lycenway
 * @see LOVBinghaiLeixing
 * @generated
 */
public class LOVBinghaiLeixingCacheModel implements CacheModel<LOVBinghaiLeixing>,
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
    public LOVBinghaiLeixing toEntityModel() {
        LOVBinghaiLeixingImpl lovBinghaiLeixingImpl = new LOVBinghaiLeixingImpl();

        if (code == null) {
            lovBinghaiLeixingImpl.setCode(StringPool.BLANK);
        } else {
            lovBinghaiLeixingImpl.setCode(code);
        }

        if (title == null) {
            lovBinghaiLeixingImpl.setTitle(StringPool.BLANK);
        } else {
            lovBinghaiLeixingImpl.setTitle(title);
        }

        lovBinghaiLeixingImpl.resetOriginalValues();

        return lovBinghaiLeixingImpl;
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
