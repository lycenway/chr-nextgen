package com.lycenway.chr.backbone.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import com.lycenway.chr.backbone.model.BinghaiClp;
import com.lycenway.chr.backbone.model.BinghaiPingfenClp;
import com.lycenway.chr.backbone.model.BinghaiProofClp;
import com.lycenway.chr.backbone.model.LOVBinghaiLeixingClp;
import com.lycenway.chr.backbone.model.LOVMuTypeClp;
import com.lycenway.chr.backbone.model.MuClp;
import com.lycenway.chr.backbone.model.MuExtClp;
import com.lycenway.chr.backbone.model.MuInterrelClp;
import com.lycenway.chr.backbone.model.MuQuxianQujianClp;
import com.lycenway.chr.backbone.model.MuWufengXianluClp;
import com.lycenway.chr.backbone.model.MuZhengxianPodaoClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "nextgen-service-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "nextgen-service-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "nextgen-service-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(BinghaiClp.class.getName())) {
            return translateInputBinghai(oldModel);
        }

        if (oldModelClassName.equals(BinghaiPingfenClp.class.getName())) {
            return translateInputBinghaiPingfen(oldModel);
        }

        if (oldModelClassName.equals(BinghaiProofClp.class.getName())) {
            return translateInputBinghaiProof(oldModel);
        }

        if (oldModelClassName.equals(LOVBinghaiLeixingClp.class.getName())) {
            return translateInputLOVBinghaiLeixing(oldModel);
        }

        if (oldModelClassName.equals(LOVMuTypeClp.class.getName())) {
            return translateInputLOVMuType(oldModel);
        }

        if (oldModelClassName.equals(MuClp.class.getName())) {
            return translateInputMu(oldModel);
        }

        if (oldModelClassName.equals(MuExtClp.class.getName())) {
            return translateInputMuExt(oldModel);
        }

        if (oldModelClassName.equals(MuInterrelClp.class.getName())) {
            return translateInputMuInterrel(oldModel);
        }

        if (oldModelClassName.equals(MuQuxianQujianClp.class.getName())) {
            return translateInputMuQuxianQujian(oldModel);
        }

        if (oldModelClassName.equals(MuWufengXianluClp.class.getName())) {
            return translateInputMuWufengXianlu(oldModel);
        }

        if (oldModelClassName.equals(MuZhengxianPodaoClp.class.getName())) {
            return translateInputMuZhengxianPodao(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputBinghai(BaseModel<?> oldModel) {
        BinghaiClp oldClpModel = (BinghaiClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getBinghaiRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputBinghaiPingfen(BaseModel<?> oldModel) {
        BinghaiPingfenClp oldClpModel = (BinghaiPingfenClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getBinghaiPingfenRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputBinghaiProof(BaseModel<?> oldModel) {
        BinghaiProofClp oldClpModel = (BinghaiProofClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getBinghaiProofRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputLOVBinghaiLeixing(BaseModel<?> oldModel) {
        LOVBinghaiLeixingClp oldClpModel = (LOVBinghaiLeixingClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getLOVBinghaiLeixingRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputLOVMuType(BaseModel<?> oldModel) {
        LOVMuTypeClp oldClpModel = (LOVMuTypeClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getLOVMuTypeRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputMu(BaseModel<?> oldModel) {
        MuClp oldClpModel = (MuClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getMuRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputMuExt(BaseModel<?> oldModel) {
        MuExtClp oldClpModel = (MuExtClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getMuExtRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputMuInterrel(BaseModel<?> oldModel) {
        MuInterrelClp oldClpModel = (MuInterrelClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getMuInterrelRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputMuQuxianQujian(BaseModel<?> oldModel) {
        MuQuxianQujianClp oldClpModel = (MuQuxianQujianClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getMuQuxianQujianRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputMuWufengXianlu(BaseModel<?> oldModel) {
        MuWufengXianluClp oldClpModel = (MuWufengXianluClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getMuWufengXianluRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputMuZhengxianPodao(BaseModel<?> oldModel) {
        MuZhengxianPodaoClp oldClpModel = (MuZhengxianPodaoClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getMuZhengxianPodaoRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "com.lycenway.chr.backbone.model.impl.BinghaiImpl")) {
            return translateOutputBinghai(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.lycenway.chr.backbone.model.impl.BinghaiPingfenImpl")) {
            return translateOutputBinghaiPingfen(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.lycenway.chr.backbone.model.impl.BinghaiProofImpl")) {
            return translateOutputBinghaiProof(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.lycenway.chr.backbone.model.impl.LOVBinghaiLeixingImpl")) {
            return translateOutputLOVBinghaiLeixing(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.lycenway.chr.backbone.model.impl.LOVMuTypeImpl")) {
            return translateOutputLOVMuType(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.lycenway.chr.backbone.model.impl.MuImpl")) {
            return translateOutputMu(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.lycenway.chr.backbone.model.impl.MuExtImpl")) {
            return translateOutputMuExt(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.lycenway.chr.backbone.model.impl.MuInterrelImpl")) {
            return translateOutputMuInterrel(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.lycenway.chr.backbone.model.impl.MuQuxianQujianImpl")) {
            return translateOutputMuQuxianQujian(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.lycenway.chr.backbone.model.impl.MuWufengXianluImpl")) {
            return translateOutputMuWufengXianlu(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "com.lycenway.chr.backbone.model.impl.MuZhengxianPodaoImpl")) {
            return translateOutputMuZhengxianPodao(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals("com.lycenway.chr.backbone.BinghaiNameException")) {
            return new com.lycenway.chr.backbone.BinghaiNameException();
        }

        if (className.equals("com.lycenway.chr.backbone.NoSuchBinghaiException")) {
            return new com.lycenway.chr.backbone.NoSuchBinghaiException();
        }

        if (className.equals(
                    "com.lycenway.chr.backbone.NoSuchBinghaiPingfenException")) {
            return new com.lycenway.chr.backbone.NoSuchBinghaiPingfenException();
        }

        if (className.equals(
                    "com.lycenway.chr.backbone.NoSuchBinghaiProofException")) {
            return new com.lycenway.chr.backbone.NoSuchBinghaiProofException();
        }

        if (className.equals(
                    "com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException")) {
            return new com.lycenway.chr.backbone.NoSuchLOVBinghaiLeixingException();
        }

        if (className.equals(
                    "com.lycenway.chr.backbone.NoSuchLOVMuTypeException")) {
            return new com.lycenway.chr.backbone.NoSuchLOVMuTypeException();
        }

        if (className.equals("com.lycenway.chr.backbone.NoSuchMuException")) {
            return new com.lycenway.chr.backbone.NoSuchMuException();
        }

        if (className.equals("com.lycenway.chr.backbone.NoSuchMuExtException")) {
            return new com.lycenway.chr.backbone.NoSuchMuExtException();
        }

        if (className.equals(
                    "com.lycenway.chr.backbone.NoSuchMuInterrelException")) {
            return new com.lycenway.chr.backbone.NoSuchMuInterrelException();
        }

        if (className.equals(
                    "com.lycenway.chr.backbone.NoSuchMuQuxianQujianException")) {
            return new com.lycenway.chr.backbone.NoSuchMuQuxianQujianException();
        }

        if (className.equals(
                    "com.lycenway.chr.backbone.NoSuchMuWufengXianluException")) {
            return new com.lycenway.chr.backbone.NoSuchMuWufengXianluException();
        }

        if (className.equals(
                    "com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException")) {
            return new com.lycenway.chr.backbone.NoSuchMuZhengxianPodaoException();
        }

        return throwable;
    }

    public static Object translateOutputBinghai(BaseModel<?> oldModel) {
        BinghaiClp newModel = new BinghaiClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setBinghaiRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputBinghaiPingfen(BaseModel<?> oldModel) {
        BinghaiPingfenClp newModel = new BinghaiPingfenClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setBinghaiPingfenRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputBinghaiProof(BaseModel<?> oldModel) {
        BinghaiProofClp newModel = new BinghaiProofClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setBinghaiProofRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputLOVBinghaiLeixing(BaseModel<?> oldModel) {
        LOVBinghaiLeixingClp newModel = new LOVBinghaiLeixingClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setLOVBinghaiLeixingRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputLOVMuType(BaseModel<?> oldModel) {
        LOVMuTypeClp newModel = new LOVMuTypeClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setLOVMuTypeRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputMu(BaseModel<?> oldModel) {
        MuClp newModel = new MuClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setMuRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputMuExt(BaseModel<?> oldModel) {
        MuExtClp newModel = new MuExtClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setMuExtRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputMuInterrel(BaseModel<?> oldModel) {
        MuInterrelClp newModel = new MuInterrelClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setMuInterrelRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputMuQuxianQujian(BaseModel<?> oldModel) {
        MuQuxianQujianClp newModel = new MuQuxianQujianClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setMuQuxianQujianRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputMuWufengXianlu(BaseModel<?> oldModel) {
        MuWufengXianluClp newModel = new MuWufengXianluClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setMuWufengXianluRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputMuZhengxianPodao(BaseModel<?> oldModel) {
        MuZhengxianPodaoClp newModel = new MuZhengxianPodaoClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setMuZhengxianPodaoRemoteModel(oldModel);

        return newModel;
    }
}
