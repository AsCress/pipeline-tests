package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.NativeContext;
import io.realm.internal.OsList;
import io.realm.internal.OsMap;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSet;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class io_pslab_models_LogicAnalyzerDataRealmProxy extends io.pslab.models.LogicAnalyzerData
    implements RealmObjectProxy, io_pslab_models_LogicAnalyzerDataRealmProxyInterface {

    static final class LogicAnalyzerDataColumnInfo extends ColumnInfo {
        long timeColKey;
        long blockColKey;
        long dataXColKey;
        long dataYColKey;
        long channelColKey;
        long latColKey;
        long lonColKey;
        long channelModeColKey;

        LogicAnalyzerDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("LogicAnalyzerData");
            this.timeColKey = addColumnDetails("time", "time", objectSchemaInfo);
            this.blockColKey = addColumnDetails("block", "block", objectSchemaInfo);
            this.dataXColKey = addColumnDetails("dataX", "dataX", objectSchemaInfo);
            this.dataYColKey = addColumnDetails("dataY", "dataY", objectSchemaInfo);
            this.channelColKey = addColumnDetails("channel", "channel", objectSchemaInfo);
            this.latColKey = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lonColKey = addColumnDetails("lon", "lon", objectSchemaInfo);
            this.channelModeColKey = addColumnDetails("channelMode", "channelMode", objectSchemaInfo);
        }

        LogicAnalyzerDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new LogicAnalyzerDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final LogicAnalyzerDataColumnInfo src = (LogicAnalyzerDataColumnInfo) rawSrc;
            final LogicAnalyzerDataColumnInfo dst = (LogicAnalyzerDataColumnInfo) rawDst;
            dst.timeColKey = src.timeColKey;
            dst.blockColKey = src.blockColKey;
            dst.dataXColKey = src.dataXColKey;
            dst.dataYColKey = src.dataYColKey;
            dst.channelColKey = src.channelColKey;
            dst.latColKey = src.latColKey;
            dst.lonColKey = src.lonColKey;
            dst.channelModeColKey = src.channelModeColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private LogicAnalyzerDataColumnInfo columnInfo;
    private ProxyState<io.pslab.models.LogicAnalyzerData> proxyState;

    io_pslab_models_LogicAnalyzerDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (LogicAnalyzerDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.pslab.models.LogicAnalyzerData>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$time() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timeColKey);
    }

    @Override
    public void realmSet$time(long value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'time' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$block() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.blockColKey);
    }

    @Override
    public void realmSet$block(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.blockColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.blockColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dataX() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dataXColKey);
    }

    @Override
    public void realmSet$dataX(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dataXColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.dataXColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dataXColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dataXColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$dataY() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dataYColKey);
    }

    @Override
    public void realmSet$dataY(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dataYColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.dataYColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dataYColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dataYColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$channel() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.channelColKey);
    }

    @Override
    public void realmSet$channel(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.channelColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.channelColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.channelColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.channelColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$lat() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.latColKey);
    }

    @Override
    public void realmSet$lat(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.latColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.latColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$lon() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.lonColKey);
    }

    @Override
    public void realmSet$lon(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.lonColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.lonColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$channelMode() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.channelModeColKey);
    }

    @Override
    public void realmSet$channelMode(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.channelModeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.channelModeColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "LogicAnalyzerData", false, 8, 0);
        builder.addPersistedProperty(NO_ALIAS, "time", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "block", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "dataX", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "dataY", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "channel", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "channelMode", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static LogicAnalyzerDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new LogicAnalyzerDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "LogicAnalyzerData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "LogicAnalyzerData";
    }

    @SuppressWarnings("cast")
    public static io.pslab.models.LogicAnalyzerData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.pslab.models.LogicAnalyzerData obj = null;
        if (update) {
            Table table = realm.getTable(io.pslab.models.LogicAnalyzerData.class);
            LogicAnalyzerDataColumnInfo columnInfo = (LogicAnalyzerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.LogicAnalyzerData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("time")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("time"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(io.pslab.models.LogicAnalyzerData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("time")) {
                if (json.isNull("time")) {
                    obj = (io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy) realm.createObjectInternal(io.pslab.models.LogicAnalyzerData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy) realm.createObjectInternal(io.pslab.models.LogicAnalyzerData.class, json.getLong("time"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'time'.");
            }
        }

        final io_pslab_models_LogicAnalyzerDataRealmProxyInterface objProxy = (io_pslab_models_LogicAnalyzerDataRealmProxyInterface) obj;
        if (json.has("block")) {
            if (json.isNull("block")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'block' to null.");
            } else {
                objProxy.realmSet$block((long) json.getLong("block"));
            }
        }
        if (json.has("dataX")) {
            if (json.isNull("dataX")) {
                objProxy.realmSet$dataX(null);
            } else {
                objProxy.realmSet$dataX((String) json.getString("dataX"));
            }
        }
        if (json.has("dataY")) {
            if (json.isNull("dataY")) {
                objProxy.realmSet$dataY(null);
            } else {
                objProxy.realmSet$dataY((String) json.getString("dataY"));
            }
        }
        if (json.has("channel")) {
            if (json.isNull("channel")) {
                objProxy.realmSet$channel(null);
            } else {
                objProxy.realmSet$channel((String) json.getString("channel"));
            }
        }
        if (json.has("lat")) {
            if (json.isNull("lat")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lat' to null.");
            } else {
                objProxy.realmSet$lat((double) json.getDouble("lat"));
            }
        }
        if (json.has("lon")) {
            if (json.isNull("lon")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lon' to null.");
            } else {
                objProxy.realmSet$lon((double) json.getDouble("lon"));
            }
        }
        if (json.has("channelMode")) {
            if (json.isNull("channelMode")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'channelMode' to null.");
            } else {
                objProxy.realmSet$channelMode((int) json.getInt("channelMode"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static io.pslab.models.LogicAnalyzerData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final io.pslab.models.LogicAnalyzerData obj = new io.pslab.models.LogicAnalyzerData();
        final io_pslab_models_LogicAnalyzerDataRealmProxyInterface objProxy = (io_pslab_models_LogicAnalyzerDataRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("time")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$time((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'time' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("block")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$block((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'block' to null.");
                }
            } else if (name.equals("dataX")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dataX((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dataX(null);
                }
            } else if (name.equals("dataY")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dataY((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$dataY(null);
                }
            } else if (name.equals("channel")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$channel((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$channel(null);
                }
            } else if (name.equals("lat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lat((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lat' to null.");
                }
            } else if (name.equals("lon")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lon((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lon' to null.");
                }
            } else if (name.equals("channelMode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$channelMode((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'channelMode' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'time'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static io_pslab_models_LogicAnalyzerDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(io.pslab.models.LogicAnalyzerData.class), false, Collections.<String>emptyList());
        io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy obj = new io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static io.pslab.models.LogicAnalyzerData copyOrUpdate(Realm realm, LogicAnalyzerDataColumnInfo columnInfo, io.pslab.models.LogicAnalyzerData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (io.pslab.models.LogicAnalyzerData) cachedRealmObject;
        }

        io.pslab.models.LogicAnalyzerData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(io.pslab.models.LogicAnalyzerData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static io.pslab.models.LogicAnalyzerData copy(Realm realm, LogicAnalyzerDataColumnInfo columnInfo, io.pslab.models.LogicAnalyzerData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.pslab.models.LogicAnalyzerData) cachedRealmObject;
        }

        io_pslab_models_LogicAnalyzerDataRealmProxyInterface unmanagedSource = (io_pslab_models_LogicAnalyzerDataRealmProxyInterface) newObject;

        Table table = realm.getTable(io.pslab.models.LogicAnalyzerData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.timeColKey, unmanagedSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, unmanagedSource.realmGet$block());
        builder.addString(columnInfo.dataXColKey, unmanagedSource.realmGet$dataX());
        builder.addString(columnInfo.dataYColKey, unmanagedSource.realmGet$dataY());
        builder.addString(columnInfo.channelColKey, unmanagedSource.realmGet$channel());
        builder.addDouble(columnInfo.latColKey, unmanagedSource.realmGet$lat());
        builder.addDouble(columnInfo.lonColKey, unmanagedSource.realmGet$lon());
        builder.addInteger(columnInfo.channelModeColKey, unmanagedSource.realmGet$channelMode());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.io_pslab_models_LogicAnalyzerDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, io.pslab.models.LogicAnalyzerData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.LogicAnalyzerData.class);
        long tableNativePtr = table.getNativePtr();
        LogicAnalyzerDataColumnInfo columnInfo = (LogicAnalyzerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.LogicAnalyzerData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$block(), false);
        String realmGet$dataX = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$dataX();
        if (realmGet$dataX != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataXColKey, objKey, realmGet$dataX, false);
        }
        String realmGet$dataY = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$dataY();
        if (realmGet$dataY != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataYColKey, objKey, realmGet$dataY, false);
        }
        String realmGet$channel = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$channel();
        if (realmGet$channel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$lon(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.channelModeColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$channelMode(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.LogicAnalyzerData.class);
        long tableNativePtr = table.getNativePtr();
        LogicAnalyzerDataColumnInfo columnInfo = (LogicAnalyzerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.LogicAnalyzerData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.LogicAnalyzerData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.LogicAnalyzerData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$block(), false);
            String realmGet$dataX = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$dataX();
            if (realmGet$dataX != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataXColKey, objKey, realmGet$dataX, false);
            }
            String realmGet$dataY = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$dataY();
            if (realmGet$dataY != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataYColKey, objKey, realmGet$dataY, false);
            }
            String realmGet$channel = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$channel();
            if (realmGet$channel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$lon(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.channelModeColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$channelMode(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, io.pslab.models.LogicAnalyzerData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.LogicAnalyzerData.class);
        long tableNativePtr = table.getNativePtr();
        LogicAnalyzerDataColumnInfo columnInfo = (LogicAnalyzerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.LogicAnalyzerData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$block(), false);
        String realmGet$dataX = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$dataX();
        if (realmGet$dataX != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataXColKey, objKey, realmGet$dataX, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dataXColKey, objKey, false);
        }
        String realmGet$dataY = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$dataY();
        if (realmGet$dataY != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataYColKey, objKey, realmGet$dataY, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dataYColKey, objKey, false);
        }
        String realmGet$channel = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$channel();
        if (realmGet$channel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.channelColKey, objKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$lon(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.channelModeColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$channelMode(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.LogicAnalyzerData.class);
        long tableNativePtr = table.getNativePtr();
        LogicAnalyzerDataColumnInfo columnInfo = (LogicAnalyzerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.LogicAnalyzerData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.LogicAnalyzerData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.LogicAnalyzerData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$time());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$block(), false);
            String realmGet$dataX = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$dataX();
            if (realmGet$dataX != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataXColKey, objKey, realmGet$dataX, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dataXColKey, objKey, false);
            }
            String realmGet$dataY = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$dataY();
            if (realmGet$dataY != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataYColKey, objKey, realmGet$dataY, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dataYColKey, objKey, false);
            }
            String realmGet$channel = ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$channel();
            if (realmGet$channel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.channelColKey, objKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$lon(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.channelModeColKey, objKey, ((io_pslab_models_LogicAnalyzerDataRealmProxyInterface) object).realmGet$channelMode(), false);
        }
    }

    public static io.pslab.models.LogicAnalyzerData createDetachedCopy(io.pslab.models.LogicAnalyzerData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.pslab.models.LogicAnalyzerData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.pslab.models.LogicAnalyzerData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.pslab.models.LogicAnalyzerData) cachedObject.object;
            }
            unmanagedObject = (io.pslab.models.LogicAnalyzerData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_pslab_models_LogicAnalyzerDataRealmProxyInterface unmanagedCopy = (io_pslab_models_LogicAnalyzerDataRealmProxyInterface) unmanagedObject;
        io_pslab_models_LogicAnalyzerDataRealmProxyInterface realmSource = (io_pslab_models_LogicAnalyzerDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$time(realmSource.realmGet$time());
        unmanagedCopy.realmSet$block(realmSource.realmGet$block());
        unmanagedCopy.realmSet$dataX(realmSource.realmGet$dataX());
        unmanagedCopy.realmSet$dataY(realmSource.realmGet$dataY());
        unmanagedCopy.realmSet$channel(realmSource.realmGet$channel());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());
        unmanagedCopy.realmSet$channelMode(realmSource.realmGet$channelMode());

        return unmanagedObject;
    }

    static io.pslab.models.LogicAnalyzerData update(Realm realm, LogicAnalyzerDataColumnInfo columnInfo, io.pslab.models.LogicAnalyzerData realmObject, io.pslab.models.LogicAnalyzerData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        io_pslab_models_LogicAnalyzerDataRealmProxyInterface realmObjectTarget = (io_pslab_models_LogicAnalyzerDataRealmProxyInterface) realmObject;
        io_pslab_models_LogicAnalyzerDataRealmProxyInterface realmObjectSource = (io_pslab_models_LogicAnalyzerDataRealmProxyInterface) newObject;
        Table table = realm.getTable(io.pslab.models.LogicAnalyzerData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.timeColKey, realmObjectSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, realmObjectSource.realmGet$block());
        builder.addString(columnInfo.dataXColKey, realmObjectSource.realmGet$dataX());
        builder.addString(columnInfo.dataYColKey, realmObjectSource.realmGet$dataY());
        builder.addString(columnInfo.channelColKey, realmObjectSource.realmGet$channel());
        builder.addDouble(columnInfo.latColKey, realmObjectSource.realmGet$lat());
        builder.addDouble(columnInfo.lonColKey, realmObjectSource.realmGet$lon());
        builder.addInteger(columnInfo.channelModeColKey, realmObjectSource.realmGet$channelMode());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        io_pslab_models_LogicAnalyzerDataRealmProxy aLogicAnalyzerData = (io_pslab_models_LogicAnalyzerDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aLogicAnalyzerData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aLogicAnalyzerData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aLogicAnalyzerData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
