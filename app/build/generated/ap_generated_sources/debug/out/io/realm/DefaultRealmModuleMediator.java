package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(18);
        modelClasses.add(io.pslab.models.WaveGeneratorData.class);
        modelClasses.add(io.pslab.models.ThermometerData.class);
        modelClasses.add(io.pslab.models.SoundData.class);
        modelClasses.add(io.pslab.models.ServoData.class);
        modelClasses.add(io.pslab.models.SensorLogged.class);
        modelClasses.add(io.pslab.models.SensorDataBlock.class);
        modelClasses.add(io.pslab.models.PowerSourceData.class);
        modelClasses.add(io.pslab.models.OscilloscopeData.class);
        modelClasses.add(io.pslab.models.MultimeterData.class);
        modelClasses.add(io.pslab.models.LuxData.class);
        modelClasses.add(io.pslab.models.LogicAnalyzerData.class);
        modelClasses.add(io.pslab.models.GyroData.class);
        modelClasses.add(io.pslab.models.GasSensorData.class);
        modelClasses.add(io.pslab.models.DustSensorData.class);
        modelClasses.add(io.pslab.models.DataMPU6050.class);
        modelClasses.add(io.pslab.models.CompassData.class);
        modelClasses.add(io.pslab.models.BaroData.class);
        modelClasses.add(io.pslab.models.AccelerometerData.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(18);
        infoMap.put(io.pslab.models.WaveGeneratorData.class, io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.ThermometerData.class, io.realm.io_pslab_models_ThermometerDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.SoundData.class, io.realm.io_pslab_models_SoundDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.ServoData.class, io.realm.io_pslab_models_ServoDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.SensorLogged.class, io.realm.io_pslab_models_SensorLoggedRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.SensorDataBlock.class, io.realm.io_pslab_models_SensorDataBlockRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.PowerSourceData.class, io.realm.io_pslab_models_PowerSourceDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.OscilloscopeData.class, io.realm.io_pslab_models_OscilloscopeDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.MultimeterData.class, io.realm.io_pslab_models_MultimeterDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.LuxData.class, io.realm.io_pslab_models_LuxDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.LogicAnalyzerData.class, io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.GyroData.class, io.realm.io_pslab_models_GyroDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.GasSensorData.class, io.realm.io_pslab_models_GasSensorDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.DustSensorData.class, io.realm.io_pslab_models_DustSensorDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.DataMPU6050.class, io.realm.io_pslab_models_DataMPU6050RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.CompassData.class, io.realm.io_pslab_models_CompassDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.BaroData.class, io.realm.io_pslab_models_BaroDataRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(io.pslab.models.AccelerometerData.class, io.realm.io_pslab_models_AccelerometerDataRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
            return io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.ThermometerData.class)) {
            return io.realm.io_pslab_models_ThermometerDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.SoundData.class)) {
            return io.realm.io_pslab_models_SoundDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.ServoData.class)) {
            return io.realm.io_pslab_models_ServoDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.SensorLogged.class)) {
            return io.realm.io_pslab_models_SensorLoggedRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
            return io.realm.io_pslab_models_SensorDataBlockRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
            return io.realm.io_pslab_models_PowerSourceDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
            return io.realm.io_pslab_models_OscilloscopeDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.MultimeterData.class)) {
            return io.realm.io_pslab_models_MultimeterDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.LuxData.class)) {
            return io.realm.io_pslab_models_LuxDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
            return io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.GyroData.class)) {
            return io.realm.io_pslab_models_GyroDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.GasSensorData.class)) {
            return io.realm.io_pslab_models_GasSensorDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.DustSensorData.class)) {
            return io.realm.io_pslab_models_DustSensorDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
            return io.realm.io_pslab_models_DataMPU6050RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.CompassData.class)) {
            return io.realm.io_pslab_models_CompassDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.BaroData.class)) {
            return io.realm.io_pslab_models_BaroDataRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
            return io.realm.io_pslab_models_AccelerometerDataRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
            return "WaveGeneratorData";
        }
        if (clazz.equals(io.pslab.models.ThermometerData.class)) {
            return "ThermometerData";
        }
        if (clazz.equals(io.pslab.models.SoundData.class)) {
            return "SoundData";
        }
        if (clazz.equals(io.pslab.models.ServoData.class)) {
            return "ServoData";
        }
        if (clazz.equals(io.pslab.models.SensorLogged.class)) {
            return "SensorLogged";
        }
        if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
            return "SensorDataBlock";
        }
        if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
            return "PowerSourceData";
        }
        if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
            return "OscilloscopeData";
        }
        if (clazz.equals(io.pslab.models.MultimeterData.class)) {
            return "MultimeterData";
        }
        if (clazz.equals(io.pslab.models.LuxData.class)) {
            return "LuxData";
        }
        if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
            return "LogicAnalyzerData";
        }
        if (clazz.equals(io.pslab.models.GyroData.class)) {
            return "GyroData";
        }
        if (clazz.equals(io.pslab.models.GasSensorData.class)) {
            return "GasSensorData";
        }
        if (clazz.equals(io.pslab.models.DustSensorData.class)) {
            return "DustSensorData";
        }
        if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
            return "DataMPU6050";
        }
        if (clazz.equals(io.pslab.models.CompassData.class)) {
            return "CompassData";
        }
        if (clazz.equals(io.pslab.models.BaroData.class)) {
            return "BaroData";
        }
        if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
            return "AccelerometerData";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public Class<? extends RealmModel> getClazzImpl(String className) {
        checkClassName(className);

        if (className.equals("WaveGeneratorData")) {
            return io.pslab.models.WaveGeneratorData.class;
        }
        if (className.equals("ThermometerData")) {
            return io.pslab.models.ThermometerData.class;
        }
        if (className.equals("SoundData")) {
            return io.pslab.models.SoundData.class;
        }
        if (className.equals("ServoData")) {
            return io.pslab.models.ServoData.class;
        }
        if (className.equals("SensorLogged")) {
            return io.pslab.models.SensorLogged.class;
        }
        if (className.equals("SensorDataBlock")) {
            return io.pslab.models.SensorDataBlock.class;
        }
        if (className.equals("PowerSourceData")) {
            return io.pslab.models.PowerSourceData.class;
        }
        if (className.equals("OscilloscopeData")) {
            return io.pslab.models.OscilloscopeData.class;
        }
        if (className.equals("MultimeterData")) {
            return io.pslab.models.MultimeterData.class;
        }
        if (className.equals("LuxData")) {
            return io.pslab.models.LuxData.class;
        }
        if (className.equals("LogicAnalyzerData")) {
            return io.pslab.models.LogicAnalyzerData.class;
        }
        if (className.equals("GyroData")) {
            return io.pslab.models.GyroData.class;
        }
        if (className.equals("GasSensorData")) {
            return io.pslab.models.GasSensorData.class;
        }
        if (className.equals("DustSensorData")) {
            return io.pslab.models.DustSensorData.class;
        }
        if (className.equals("DataMPU6050")) {
            return io.pslab.models.DataMPU6050.class;
        }
        if (className.equals("CompassData")) {
            return io.pslab.models.CompassData.class;
        }
        if (className.equals("BaroData")) {
            return io.pslab.models.BaroData.class;
        }
        if (className.equals("AccelerometerData")) {
            return io.pslab.models.AccelerometerData.class;
        }
        throw getMissingProxyClassException(className);
    }

    @Override
    public boolean hasPrimaryKeyImpl(Class<? extends RealmModel> clazz) {
        return io.pslab.models.WaveGeneratorData.class.isAssignableFrom(clazz)
                || io.pslab.models.SoundData.class.isAssignableFrom(clazz)
                || io.pslab.models.ServoData.class.isAssignableFrom(clazz)
                || io.pslab.models.SensorLogged.class.isAssignableFrom(clazz)
                || io.pslab.models.PowerSourceData.class.isAssignableFrom(clazz)
                || io.pslab.models.OscilloscopeData.class.isAssignableFrom(clazz)
                || io.pslab.models.MultimeterData.class.isAssignableFrom(clazz)
                || io.pslab.models.LuxData.class.isAssignableFrom(clazz)
                || io.pslab.models.LogicAnalyzerData.class.isAssignableFrom(clazz)
                || io.pslab.models.GyroData.class.isAssignableFrom(clazz)
                || io.pslab.models.GasSensorData.class.isAssignableFrom(clazz)
                || io.pslab.models.DustSensorData.class.isAssignableFrom(clazz)
                || io.pslab.models.BaroData.class.isAssignableFrom(clazz)
                || io.pslab.models.AccelerometerData.class.isAssignableFrom(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_WaveGeneratorDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.ThermometerData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_ThermometerDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.SoundData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_SoundDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.ServoData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_ServoDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.SensorLogged.class)) {
                return clazz.cast(new io.realm.io_pslab_models_SensorLoggedRealmProxy());
            }
            if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
                return clazz.cast(new io.realm.io_pslab_models_SensorDataBlockRealmProxy());
            }
            if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_PowerSourceDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_OscilloscopeDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.MultimeterData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_MultimeterDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.LuxData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_LuxDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.GyroData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_GyroDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.GasSensorData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_GasSensorDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.DustSensorData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_DustSensorDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
                return clazz.cast(new io.realm.io_pslab_models_DataMPU6050RealmProxy());
            }
            if (clazz.equals(io.pslab.models.CompassData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_CompassDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.BaroData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_BaroDataRealmProxy());
            }
            if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
                return clazz.cast(new io.realm.io_pslab_models_AccelerometerDataRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
            io_pslab_models_WaveGeneratorDataRealmProxy.WaveGeneratorDataColumnInfo columnInfo = (io_pslab_models_WaveGeneratorDataRealmProxy.WaveGeneratorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.WaveGeneratorData.class);
            return clazz.cast(io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.WaveGeneratorData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.ThermometerData.class)) {
            io_pslab_models_ThermometerDataRealmProxy.ThermometerDataColumnInfo columnInfo = (io_pslab_models_ThermometerDataRealmProxy.ThermometerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.ThermometerData.class);
            return clazz.cast(io.realm.io_pslab_models_ThermometerDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.ThermometerData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.SoundData.class)) {
            io_pslab_models_SoundDataRealmProxy.SoundDataColumnInfo columnInfo = (io_pslab_models_SoundDataRealmProxy.SoundDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SoundData.class);
            return clazz.cast(io.realm.io_pslab_models_SoundDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.SoundData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.ServoData.class)) {
            io_pslab_models_ServoDataRealmProxy.ServoDataColumnInfo columnInfo = (io_pslab_models_ServoDataRealmProxy.ServoDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.ServoData.class);
            return clazz.cast(io.realm.io_pslab_models_ServoDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.ServoData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.SensorLogged.class)) {
            io_pslab_models_SensorLoggedRealmProxy.SensorLoggedColumnInfo columnInfo = (io_pslab_models_SensorLoggedRealmProxy.SensorLoggedColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SensorLogged.class);
            return clazz.cast(io.realm.io_pslab_models_SensorLoggedRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.SensorLogged) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
            io_pslab_models_SensorDataBlockRealmProxy.SensorDataBlockColumnInfo columnInfo = (io_pslab_models_SensorDataBlockRealmProxy.SensorDataBlockColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SensorDataBlock.class);
            return clazz.cast(io.realm.io_pslab_models_SensorDataBlockRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.SensorDataBlock) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
            io_pslab_models_PowerSourceDataRealmProxy.PowerSourceDataColumnInfo columnInfo = (io_pslab_models_PowerSourceDataRealmProxy.PowerSourceDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.PowerSourceData.class);
            return clazz.cast(io.realm.io_pslab_models_PowerSourceDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.PowerSourceData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
            io_pslab_models_OscilloscopeDataRealmProxy.OscilloscopeDataColumnInfo columnInfo = (io_pslab_models_OscilloscopeDataRealmProxy.OscilloscopeDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.OscilloscopeData.class);
            return clazz.cast(io.realm.io_pslab_models_OscilloscopeDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.OscilloscopeData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.MultimeterData.class)) {
            io_pslab_models_MultimeterDataRealmProxy.MultimeterDataColumnInfo columnInfo = (io_pslab_models_MultimeterDataRealmProxy.MultimeterDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.MultimeterData.class);
            return clazz.cast(io.realm.io_pslab_models_MultimeterDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.MultimeterData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.LuxData.class)) {
            io_pslab_models_LuxDataRealmProxy.LuxDataColumnInfo columnInfo = (io_pslab_models_LuxDataRealmProxy.LuxDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.LuxData.class);
            return clazz.cast(io.realm.io_pslab_models_LuxDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.LuxData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
            io_pslab_models_LogicAnalyzerDataRealmProxy.LogicAnalyzerDataColumnInfo columnInfo = (io_pslab_models_LogicAnalyzerDataRealmProxy.LogicAnalyzerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.LogicAnalyzerData.class);
            return clazz.cast(io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.LogicAnalyzerData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.GyroData.class)) {
            io_pslab_models_GyroDataRealmProxy.GyroDataColumnInfo columnInfo = (io_pslab_models_GyroDataRealmProxy.GyroDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.GyroData.class);
            return clazz.cast(io.realm.io_pslab_models_GyroDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.GyroData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.GasSensorData.class)) {
            io_pslab_models_GasSensorDataRealmProxy.GasSensorDataColumnInfo columnInfo = (io_pslab_models_GasSensorDataRealmProxy.GasSensorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.GasSensorData.class);
            return clazz.cast(io.realm.io_pslab_models_GasSensorDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.GasSensorData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.DustSensorData.class)) {
            io_pslab_models_DustSensorDataRealmProxy.DustSensorDataColumnInfo columnInfo = (io_pslab_models_DustSensorDataRealmProxy.DustSensorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.DustSensorData.class);
            return clazz.cast(io.realm.io_pslab_models_DustSensorDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.DustSensorData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
            io_pslab_models_DataMPU6050RealmProxy.DataMPU6050ColumnInfo columnInfo = (io_pslab_models_DataMPU6050RealmProxy.DataMPU6050ColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.DataMPU6050.class);
            return clazz.cast(io.realm.io_pslab_models_DataMPU6050RealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.DataMPU6050) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.CompassData.class)) {
            io_pslab_models_CompassDataRealmProxy.CompassDataColumnInfo columnInfo = (io_pslab_models_CompassDataRealmProxy.CompassDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.CompassData.class);
            return clazz.cast(io.realm.io_pslab_models_CompassDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.CompassData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.BaroData.class)) {
            io_pslab_models_BaroDataRealmProxy.BaroDataColumnInfo columnInfo = (io_pslab_models_BaroDataRealmProxy.BaroDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.BaroData.class);
            return clazz.cast(io.realm.io_pslab_models_BaroDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.BaroData) obj, update, cache, flags));
        }
        if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
            io_pslab_models_AccelerometerDataRealmProxy.AccelerometerDataColumnInfo columnInfo = (io_pslab_models_AccelerometerDataRealmProxy.AccelerometerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.AccelerometerData.class);
            return clazz.cast(io.realm.io_pslab_models_AccelerometerDataRealmProxy.copyOrUpdate(realm, columnInfo, (io.pslab.models.AccelerometerData) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public long insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
            return io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.insert(realm, (io.pslab.models.WaveGeneratorData) object, cache);
        } else if (clazz.equals(io.pslab.models.ThermometerData.class)) {
            return io.realm.io_pslab_models_ThermometerDataRealmProxy.insert(realm, (io.pslab.models.ThermometerData) object, cache);
        } else if (clazz.equals(io.pslab.models.SoundData.class)) {
            return io.realm.io_pslab_models_SoundDataRealmProxy.insert(realm, (io.pslab.models.SoundData) object, cache);
        } else if (clazz.equals(io.pslab.models.ServoData.class)) {
            return io.realm.io_pslab_models_ServoDataRealmProxy.insert(realm, (io.pslab.models.ServoData) object, cache);
        } else if (clazz.equals(io.pslab.models.SensorLogged.class)) {
            return io.realm.io_pslab_models_SensorLoggedRealmProxy.insert(realm, (io.pslab.models.SensorLogged) object, cache);
        } else if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
            return io.realm.io_pslab_models_SensorDataBlockRealmProxy.insert(realm, (io.pslab.models.SensorDataBlock) object, cache);
        } else if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
            return io.realm.io_pslab_models_PowerSourceDataRealmProxy.insert(realm, (io.pslab.models.PowerSourceData) object, cache);
        } else if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
            return io.realm.io_pslab_models_OscilloscopeDataRealmProxy.insert(realm, (io.pslab.models.OscilloscopeData) object, cache);
        } else if (clazz.equals(io.pslab.models.MultimeterData.class)) {
            return io.realm.io_pslab_models_MultimeterDataRealmProxy.insert(realm, (io.pslab.models.MultimeterData) object, cache);
        } else if (clazz.equals(io.pslab.models.LuxData.class)) {
            return io.realm.io_pslab_models_LuxDataRealmProxy.insert(realm, (io.pslab.models.LuxData) object, cache);
        } else if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
            return io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.insert(realm, (io.pslab.models.LogicAnalyzerData) object, cache);
        } else if (clazz.equals(io.pslab.models.GyroData.class)) {
            return io.realm.io_pslab_models_GyroDataRealmProxy.insert(realm, (io.pslab.models.GyroData) object, cache);
        } else if (clazz.equals(io.pslab.models.GasSensorData.class)) {
            return io.realm.io_pslab_models_GasSensorDataRealmProxy.insert(realm, (io.pslab.models.GasSensorData) object, cache);
        } else if (clazz.equals(io.pslab.models.DustSensorData.class)) {
            return io.realm.io_pslab_models_DustSensorDataRealmProxy.insert(realm, (io.pslab.models.DustSensorData) object, cache);
        } else if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
            return io.realm.io_pslab_models_DataMPU6050RealmProxy.insert(realm, (io.pslab.models.DataMPU6050) object, cache);
        } else if (clazz.equals(io.pslab.models.CompassData.class)) {
            return io.realm.io_pslab_models_CompassDataRealmProxy.insert(realm, (io.pslab.models.CompassData) object, cache);
        } else if (clazz.equals(io.pslab.models.BaroData.class)) {
            return io.realm.io_pslab_models_BaroDataRealmProxy.insert(realm, (io.pslab.models.BaroData) object, cache);
        } else if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
            return io.realm.io_pslab_models_AccelerometerDataRealmProxy.insert(realm, (io.pslab.models.AccelerometerData) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
                io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.insert(realm, (io.pslab.models.WaveGeneratorData) object, cache);
            } else if (clazz.equals(io.pslab.models.ThermometerData.class)) {
                io.realm.io_pslab_models_ThermometerDataRealmProxy.insert(realm, (io.pslab.models.ThermometerData) object, cache);
            } else if (clazz.equals(io.pslab.models.SoundData.class)) {
                io.realm.io_pslab_models_SoundDataRealmProxy.insert(realm, (io.pslab.models.SoundData) object, cache);
            } else if (clazz.equals(io.pslab.models.ServoData.class)) {
                io.realm.io_pslab_models_ServoDataRealmProxy.insert(realm, (io.pslab.models.ServoData) object, cache);
            } else if (clazz.equals(io.pslab.models.SensorLogged.class)) {
                io.realm.io_pslab_models_SensorLoggedRealmProxy.insert(realm, (io.pslab.models.SensorLogged) object, cache);
            } else if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
                io.realm.io_pslab_models_SensorDataBlockRealmProxy.insert(realm, (io.pslab.models.SensorDataBlock) object, cache);
            } else if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
                io.realm.io_pslab_models_PowerSourceDataRealmProxy.insert(realm, (io.pslab.models.PowerSourceData) object, cache);
            } else if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
                io.realm.io_pslab_models_OscilloscopeDataRealmProxy.insert(realm, (io.pslab.models.OscilloscopeData) object, cache);
            } else if (clazz.equals(io.pslab.models.MultimeterData.class)) {
                io.realm.io_pslab_models_MultimeterDataRealmProxy.insert(realm, (io.pslab.models.MultimeterData) object, cache);
            } else if (clazz.equals(io.pslab.models.LuxData.class)) {
                io.realm.io_pslab_models_LuxDataRealmProxy.insert(realm, (io.pslab.models.LuxData) object, cache);
            } else if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
                io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.insert(realm, (io.pslab.models.LogicAnalyzerData) object, cache);
            } else if (clazz.equals(io.pslab.models.GyroData.class)) {
                io.realm.io_pslab_models_GyroDataRealmProxy.insert(realm, (io.pslab.models.GyroData) object, cache);
            } else if (clazz.equals(io.pslab.models.GasSensorData.class)) {
                io.realm.io_pslab_models_GasSensorDataRealmProxy.insert(realm, (io.pslab.models.GasSensorData) object, cache);
            } else if (clazz.equals(io.pslab.models.DustSensorData.class)) {
                io.realm.io_pslab_models_DustSensorDataRealmProxy.insert(realm, (io.pslab.models.DustSensorData) object, cache);
            } else if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
                io.realm.io_pslab_models_DataMPU6050RealmProxy.insert(realm, (io.pslab.models.DataMPU6050) object, cache);
            } else if (clazz.equals(io.pslab.models.CompassData.class)) {
                io.realm.io_pslab_models_CompassDataRealmProxy.insert(realm, (io.pslab.models.CompassData) object, cache);
            } else if (clazz.equals(io.pslab.models.BaroData.class)) {
                io.realm.io_pslab_models_BaroDataRealmProxy.insert(realm, (io.pslab.models.BaroData) object, cache);
            } else if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
                io.realm.io_pslab_models_AccelerometerDataRealmProxy.insert(realm, (io.pslab.models.AccelerometerData) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
                    io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.ThermometerData.class)) {
                    io.realm.io_pslab_models_ThermometerDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.SoundData.class)) {
                    io.realm.io_pslab_models_SoundDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.ServoData.class)) {
                    io.realm.io_pslab_models_ServoDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.SensorLogged.class)) {
                    io.realm.io_pslab_models_SensorLoggedRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
                    io.realm.io_pslab_models_SensorDataBlockRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
                    io.realm.io_pslab_models_PowerSourceDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
                    io.realm.io_pslab_models_OscilloscopeDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.MultimeterData.class)) {
                    io.realm.io_pslab_models_MultimeterDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.LuxData.class)) {
                    io.realm.io_pslab_models_LuxDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
                    io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.GyroData.class)) {
                    io.realm.io_pslab_models_GyroDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.GasSensorData.class)) {
                    io.realm.io_pslab_models_GasSensorDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.DustSensorData.class)) {
                    io.realm.io_pslab_models_DustSensorDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
                    io.realm.io_pslab_models_DataMPU6050RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.CompassData.class)) {
                    io.realm.io_pslab_models_CompassDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.BaroData.class)) {
                    io.realm.io_pslab_models_BaroDataRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
                    io.realm.io_pslab_models_AccelerometerDataRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public long insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
            return io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.WaveGeneratorData) obj, cache);
        } else if (clazz.equals(io.pslab.models.ThermometerData.class)) {
            return io.realm.io_pslab_models_ThermometerDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.ThermometerData) obj, cache);
        } else if (clazz.equals(io.pslab.models.SoundData.class)) {
            return io.realm.io_pslab_models_SoundDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.SoundData) obj, cache);
        } else if (clazz.equals(io.pslab.models.ServoData.class)) {
            return io.realm.io_pslab_models_ServoDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.ServoData) obj, cache);
        } else if (clazz.equals(io.pslab.models.SensorLogged.class)) {
            return io.realm.io_pslab_models_SensorLoggedRealmProxy.insertOrUpdate(realm, (io.pslab.models.SensorLogged) obj, cache);
        } else if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
            return io.realm.io_pslab_models_SensorDataBlockRealmProxy.insertOrUpdate(realm, (io.pslab.models.SensorDataBlock) obj, cache);
        } else if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
            return io.realm.io_pslab_models_PowerSourceDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.PowerSourceData) obj, cache);
        } else if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
            return io.realm.io_pslab_models_OscilloscopeDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.OscilloscopeData) obj, cache);
        } else if (clazz.equals(io.pslab.models.MultimeterData.class)) {
            return io.realm.io_pslab_models_MultimeterDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.MultimeterData) obj, cache);
        } else if (clazz.equals(io.pslab.models.LuxData.class)) {
            return io.realm.io_pslab_models_LuxDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.LuxData) obj, cache);
        } else if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
            return io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.LogicAnalyzerData) obj, cache);
        } else if (clazz.equals(io.pslab.models.GyroData.class)) {
            return io.realm.io_pslab_models_GyroDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.GyroData) obj, cache);
        } else if (clazz.equals(io.pslab.models.GasSensorData.class)) {
            return io.realm.io_pslab_models_GasSensorDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.GasSensorData) obj, cache);
        } else if (clazz.equals(io.pslab.models.DustSensorData.class)) {
            return io.realm.io_pslab_models_DustSensorDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.DustSensorData) obj, cache);
        } else if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
            return io.realm.io_pslab_models_DataMPU6050RealmProxy.insertOrUpdate(realm, (io.pslab.models.DataMPU6050) obj, cache);
        } else if (clazz.equals(io.pslab.models.CompassData.class)) {
            return io.realm.io_pslab_models_CompassDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.CompassData) obj, cache);
        } else if (clazz.equals(io.pslab.models.BaroData.class)) {
            return io.realm.io_pslab_models_BaroDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.BaroData) obj, cache);
        } else if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
            return io.realm.io_pslab_models_AccelerometerDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.AccelerometerData) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
                io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.WaveGeneratorData) object, cache);
            } else if (clazz.equals(io.pslab.models.ThermometerData.class)) {
                io.realm.io_pslab_models_ThermometerDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.ThermometerData) object, cache);
            } else if (clazz.equals(io.pslab.models.SoundData.class)) {
                io.realm.io_pslab_models_SoundDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.SoundData) object, cache);
            } else if (clazz.equals(io.pslab.models.ServoData.class)) {
                io.realm.io_pslab_models_ServoDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.ServoData) object, cache);
            } else if (clazz.equals(io.pslab.models.SensorLogged.class)) {
                io.realm.io_pslab_models_SensorLoggedRealmProxy.insertOrUpdate(realm, (io.pslab.models.SensorLogged) object, cache);
            } else if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
                io.realm.io_pslab_models_SensorDataBlockRealmProxy.insertOrUpdate(realm, (io.pslab.models.SensorDataBlock) object, cache);
            } else if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
                io.realm.io_pslab_models_PowerSourceDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.PowerSourceData) object, cache);
            } else if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
                io.realm.io_pslab_models_OscilloscopeDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.OscilloscopeData) object, cache);
            } else if (clazz.equals(io.pslab.models.MultimeterData.class)) {
                io.realm.io_pslab_models_MultimeterDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.MultimeterData) object, cache);
            } else if (clazz.equals(io.pslab.models.LuxData.class)) {
                io.realm.io_pslab_models_LuxDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.LuxData) object, cache);
            } else if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
                io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.LogicAnalyzerData) object, cache);
            } else if (clazz.equals(io.pslab.models.GyroData.class)) {
                io.realm.io_pslab_models_GyroDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.GyroData) object, cache);
            } else if (clazz.equals(io.pslab.models.GasSensorData.class)) {
                io.realm.io_pslab_models_GasSensorDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.GasSensorData) object, cache);
            } else if (clazz.equals(io.pslab.models.DustSensorData.class)) {
                io.realm.io_pslab_models_DustSensorDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.DustSensorData) object, cache);
            } else if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
                io.realm.io_pslab_models_DataMPU6050RealmProxy.insertOrUpdate(realm, (io.pslab.models.DataMPU6050) object, cache);
            } else if (clazz.equals(io.pslab.models.CompassData.class)) {
                io.realm.io_pslab_models_CompassDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.CompassData) object, cache);
            } else if (clazz.equals(io.pslab.models.BaroData.class)) {
                io.realm.io_pslab_models_BaroDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.BaroData) object, cache);
            } else if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
                io.realm.io_pslab_models_AccelerometerDataRealmProxy.insertOrUpdate(realm, (io.pslab.models.AccelerometerData) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
                    io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.ThermometerData.class)) {
                    io.realm.io_pslab_models_ThermometerDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.SoundData.class)) {
                    io.realm.io_pslab_models_SoundDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.ServoData.class)) {
                    io.realm.io_pslab_models_ServoDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.SensorLogged.class)) {
                    io.realm.io_pslab_models_SensorLoggedRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
                    io.realm.io_pslab_models_SensorDataBlockRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
                    io.realm.io_pslab_models_PowerSourceDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
                    io.realm.io_pslab_models_OscilloscopeDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.MultimeterData.class)) {
                    io.realm.io_pslab_models_MultimeterDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.LuxData.class)) {
                    io.realm.io_pslab_models_LuxDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
                    io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.GyroData.class)) {
                    io.realm.io_pslab_models_GyroDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.GasSensorData.class)) {
                    io.realm.io_pslab_models_GasSensorDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.DustSensorData.class)) {
                    io.realm.io_pslab_models_DustSensorDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
                    io.realm.io_pslab_models_DataMPU6050RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.CompassData.class)) {
                    io.realm.io_pslab_models_CompassDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.BaroData.class)) {
                    io.realm.io_pslab_models_BaroDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
                    io.realm.io_pslab_models_AccelerometerDataRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
            return clazz.cast(io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.ThermometerData.class)) {
            return clazz.cast(io.realm.io_pslab_models_ThermometerDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.SoundData.class)) {
            return clazz.cast(io.realm.io_pslab_models_SoundDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.ServoData.class)) {
            return clazz.cast(io.realm.io_pslab_models_ServoDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.SensorLogged.class)) {
            return clazz.cast(io.realm.io_pslab_models_SensorLoggedRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
            return clazz.cast(io.realm.io_pslab_models_SensorDataBlockRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
            return clazz.cast(io.realm.io_pslab_models_PowerSourceDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
            return clazz.cast(io.realm.io_pslab_models_OscilloscopeDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.MultimeterData.class)) {
            return clazz.cast(io.realm.io_pslab_models_MultimeterDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.LuxData.class)) {
            return clazz.cast(io.realm.io_pslab_models_LuxDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
            return clazz.cast(io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.GyroData.class)) {
            return clazz.cast(io.realm.io_pslab_models_GyroDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.GasSensorData.class)) {
            return clazz.cast(io.realm.io_pslab_models_GasSensorDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.DustSensorData.class)) {
            return clazz.cast(io.realm.io_pslab_models_DustSensorDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
            return clazz.cast(io.realm.io_pslab_models_DataMPU6050RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.CompassData.class)) {
            return clazz.cast(io.realm.io_pslab_models_CompassDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.BaroData.class)) {
            return clazz.cast(io.realm.io_pslab_models_BaroDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
            return clazz.cast(io.realm.io_pslab_models_AccelerometerDataRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
            return clazz.cast(io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.ThermometerData.class)) {
            return clazz.cast(io.realm.io_pslab_models_ThermometerDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.SoundData.class)) {
            return clazz.cast(io.realm.io_pslab_models_SoundDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.ServoData.class)) {
            return clazz.cast(io.realm.io_pslab_models_ServoDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.SensorLogged.class)) {
            return clazz.cast(io.realm.io_pslab_models_SensorLoggedRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
            return clazz.cast(io.realm.io_pslab_models_SensorDataBlockRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
            return clazz.cast(io.realm.io_pslab_models_PowerSourceDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
            return clazz.cast(io.realm.io_pslab_models_OscilloscopeDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.MultimeterData.class)) {
            return clazz.cast(io.realm.io_pslab_models_MultimeterDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.LuxData.class)) {
            return clazz.cast(io.realm.io_pslab_models_LuxDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
            return clazz.cast(io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.GyroData.class)) {
            return clazz.cast(io.realm.io_pslab_models_GyroDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.GasSensorData.class)) {
            return clazz.cast(io.realm.io_pslab_models_GasSensorDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.DustSensorData.class)) {
            return clazz.cast(io.realm.io_pslab_models_DustSensorDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
            return clazz.cast(io.realm.io_pslab_models_DataMPU6050RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.CompassData.class)) {
            return clazz.cast(io.realm.io_pslab_models_CompassDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.BaroData.class)) {
            return clazz.cast(io.realm.io_pslab_models_BaroDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
            return clazz.cast(io.realm.io_pslab_models_AccelerometerDataRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
            return clazz.cast(io.realm.io_pslab_models_WaveGeneratorDataRealmProxy.createDetachedCopy((io.pslab.models.WaveGeneratorData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.ThermometerData.class)) {
            return clazz.cast(io.realm.io_pslab_models_ThermometerDataRealmProxy.createDetachedCopy((io.pslab.models.ThermometerData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.SoundData.class)) {
            return clazz.cast(io.realm.io_pslab_models_SoundDataRealmProxy.createDetachedCopy((io.pslab.models.SoundData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.ServoData.class)) {
            return clazz.cast(io.realm.io_pslab_models_ServoDataRealmProxy.createDetachedCopy((io.pslab.models.ServoData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.SensorLogged.class)) {
            return clazz.cast(io.realm.io_pslab_models_SensorLoggedRealmProxy.createDetachedCopy((io.pslab.models.SensorLogged) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
            return clazz.cast(io.realm.io_pslab_models_SensorDataBlockRealmProxy.createDetachedCopy((io.pslab.models.SensorDataBlock) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
            return clazz.cast(io.realm.io_pslab_models_PowerSourceDataRealmProxy.createDetachedCopy((io.pslab.models.PowerSourceData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
            return clazz.cast(io.realm.io_pslab_models_OscilloscopeDataRealmProxy.createDetachedCopy((io.pslab.models.OscilloscopeData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.MultimeterData.class)) {
            return clazz.cast(io.realm.io_pslab_models_MultimeterDataRealmProxy.createDetachedCopy((io.pslab.models.MultimeterData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.LuxData.class)) {
            return clazz.cast(io.realm.io_pslab_models_LuxDataRealmProxy.createDetachedCopy((io.pslab.models.LuxData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
            return clazz.cast(io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy.createDetachedCopy((io.pslab.models.LogicAnalyzerData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.GyroData.class)) {
            return clazz.cast(io.realm.io_pslab_models_GyroDataRealmProxy.createDetachedCopy((io.pslab.models.GyroData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.GasSensorData.class)) {
            return clazz.cast(io.realm.io_pslab_models_GasSensorDataRealmProxy.createDetachedCopy((io.pslab.models.GasSensorData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.DustSensorData.class)) {
            return clazz.cast(io.realm.io_pslab_models_DustSensorDataRealmProxy.createDetachedCopy((io.pslab.models.DustSensorData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
            return clazz.cast(io.realm.io_pslab_models_DataMPU6050RealmProxy.createDetachedCopy((io.pslab.models.DataMPU6050) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.CompassData.class)) {
            return clazz.cast(io.realm.io_pslab_models_CompassDataRealmProxy.createDetachedCopy((io.pslab.models.CompassData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.BaroData.class)) {
            return clazz.cast(io.realm.io_pslab_models_BaroDataRealmProxy.createDetachedCopy((io.pslab.models.BaroData) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
            return clazz.cast(io.realm.io_pslab_models_AccelerometerDataRealmProxy.createDetachedCopy((io.pslab.models.AccelerometerData) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> boolean isEmbedded(Class<E> clazz) {
        if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.ThermometerData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.SoundData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.ServoData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.SensorLogged.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.MultimeterData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.LuxData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.GyroData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.GasSensorData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.DustSensorData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.CompassData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.BaroData.class)) {
            return false;
        }
        if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
            return false;
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E unmanagedObject, E managedObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) managedObject.getClass().getSuperclass();

        if (clazz.equals(io.pslab.models.WaveGeneratorData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.WaveGeneratorData");
        } else if (clazz.equals(io.pslab.models.ThermometerData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.ThermometerData");
        } else if (clazz.equals(io.pslab.models.SoundData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.SoundData");
        } else if (clazz.equals(io.pslab.models.ServoData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.ServoData");
        } else if (clazz.equals(io.pslab.models.SensorLogged.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.SensorLogged");
        } else if (clazz.equals(io.pslab.models.SensorDataBlock.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.SensorDataBlock");
        } else if (clazz.equals(io.pslab.models.PowerSourceData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.PowerSourceData");
        } else if (clazz.equals(io.pslab.models.OscilloscopeData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.OscilloscopeData");
        } else if (clazz.equals(io.pslab.models.MultimeterData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.MultimeterData");
        } else if (clazz.equals(io.pslab.models.LuxData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.LuxData");
        } else if (clazz.equals(io.pslab.models.LogicAnalyzerData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.LogicAnalyzerData");
        } else if (clazz.equals(io.pslab.models.GyroData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.GyroData");
        } else if (clazz.equals(io.pslab.models.GasSensorData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.GasSensorData");
        } else if (clazz.equals(io.pslab.models.DustSensorData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.DustSensorData");
        } else if (clazz.equals(io.pslab.models.DataMPU6050.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.DataMPU6050");
        } else if (clazz.equals(io.pslab.models.CompassData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.CompassData");
        } else if (clazz.equals(io.pslab.models.BaroData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.BaroData");
        } else if (clazz.equals(io.pslab.models.AccelerometerData.class)) {
            throw getNotEmbeddedClassException("io.pslab.models.AccelerometerData");
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

}
