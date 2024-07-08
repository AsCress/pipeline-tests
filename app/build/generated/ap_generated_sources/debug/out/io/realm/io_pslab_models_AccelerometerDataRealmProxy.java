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
public class io_pslab_models_AccelerometerDataRealmProxy extends io.pslab.models.AccelerometerData
    implements RealmObjectProxy, io_pslab_models_AccelerometerDataRealmProxyInterface {

    static final class AccelerometerDataColumnInfo extends ColumnInfo {
        long timeColKey;
        long blockColKey;
        long accelerometerXColKey;
        long accelerometerYColKey;
        long accelerometerZColKey;
        long latColKey;
        long lonColKey;

        AccelerometerDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("AccelerometerData");
            this.timeColKey = addColumnDetails("time", "time", objectSchemaInfo);
            this.blockColKey = addColumnDetails("block", "block", objectSchemaInfo);
            this.accelerometerXColKey = addColumnDetails("accelerometerX", "accelerometerX", objectSchemaInfo);
            this.accelerometerYColKey = addColumnDetails("accelerometerY", "accelerometerY", objectSchemaInfo);
            this.accelerometerZColKey = addColumnDetails("accelerometerZ", "accelerometerZ", objectSchemaInfo);
            this.latColKey = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lonColKey = addColumnDetails("lon", "lon", objectSchemaInfo);
        }

        AccelerometerDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AccelerometerDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AccelerometerDataColumnInfo src = (AccelerometerDataColumnInfo) rawSrc;
            final AccelerometerDataColumnInfo dst = (AccelerometerDataColumnInfo) rawDst;
            dst.timeColKey = src.timeColKey;
            dst.blockColKey = src.blockColKey;
            dst.accelerometerXColKey = src.accelerometerXColKey;
            dst.accelerometerYColKey = src.accelerometerYColKey;
            dst.accelerometerZColKey = src.accelerometerZColKey;
            dst.latColKey = src.latColKey;
            dst.lonColKey = src.lonColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private AccelerometerDataColumnInfo columnInfo;
    private ProxyState<io.pslab.models.AccelerometerData> proxyState;

    io_pslab_models_AccelerometerDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AccelerometerDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.pslab.models.AccelerometerData>(this);
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
    public float realmGet$accelerometerX() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.accelerometerXColKey);
    }

    @Override
    public void realmSet$accelerometerX(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.accelerometerXColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.accelerometerXColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$accelerometerY() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.accelerometerYColKey);
    }

    @Override
    public void realmSet$accelerometerY(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.accelerometerYColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.accelerometerYColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$accelerometerZ() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.accelerometerZColKey);
    }

    @Override
    public void realmSet$accelerometerZ(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.accelerometerZColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.accelerometerZColKey, value);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "AccelerometerData", false, 7, 0);
        builder.addPersistedProperty(NO_ALIAS, "time", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "block", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "accelerometerX", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "accelerometerY", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "accelerometerZ", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AccelerometerDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new AccelerometerDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "AccelerometerData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AccelerometerData";
    }

    @SuppressWarnings("cast")
    public static io.pslab.models.AccelerometerData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.pslab.models.AccelerometerData obj = null;
        if (update) {
            Table table = realm.getTable(io.pslab.models.AccelerometerData.class);
            AccelerometerDataColumnInfo columnInfo = (AccelerometerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.AccelerometerData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("time")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("time"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(io.pslab.models.AccelerometerData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.io_pslab_models_AccelerometerDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("time")) {
                if (json.isNull("time")) {
                    obj = (io.realm.io_pslab_models_AccelerometerDataRealmProxy) realm.createObjectInternal(io.pslab.models.AccelerometerData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.io_pslab_models_AccelerometerDataRealmProxy) realm.createObjectInternal(io.pslab.models.AccelerometerData.class, json.getLong("time"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'time'.");
            }
        }

        final io_pslab_models_AccelerometerDataRealmProxyInterface objProxy = (io_pslab_models_AccelerometerDataRealmProxyInterface) obj;
        if (json.has("block")) {
            if (json.isNull("block")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'block' to null.");
            } else {
                objProxy.realmSet$block((long) json.getLong("block"));
            }
        }
        if (json.has("accelerometerX")) {
            if (json.isNull("accelerometerX")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'accelerometerX' to null.");
            } else {
                objProxy.realmSet$accelerometerX((float) json.getDouble("accelerometerX"));
            }
        }
        if (json.has("accelerometerY")) {
            if (json.isNull("accelerometerY")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'accelerometerY' to null.");
            } else {
                objProxy.realmSet$accelerometerY((float) json.getDouble("accelerometerY"));
            }
        }
        if (json.has("accelerometerZ")) {
            if (json.isNull("accelerometerZ")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'accelerometerZ' to null.");
            } else {
                objProxy.realmSet$accelerometerZ((float) json.getDouble("accelerometerZ"));
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
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static io.pslab.models.AccelerometerData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final io.pslab.models.AccelerometerData obj = new io.pslab.models.AccelerometerData();
        final io_pslab_models_AccelerometerDataRealmProxyInterface objProxy = (io_pslab_models_AccelerometerDataRealmProxyInterface) obj;
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
            } else if (name.equals("accelerometerX")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$accelerometerX((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'accelerometerX' to null.");
                }
            } else if (name.equals("accelerometerY")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$accelerometerY((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'accelerometerY' to null.");
                }
            } else if (name.equals("accelerometerZ")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$accelerometerZ((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'accelerometerZ' to null.");
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

    static io_pslab_models_AccelerometerDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(io.pslab.models.AccelerometerData.class), false, Collections.<String>emptyList());
        io.realm.io_pslab_models_AccelerometerDataRealmProxy obj = new io.realm.io_pslab_models_AccelerometerDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static io.pslab.models.AccelerometerData copyOrUpdate(Realm realm, AccelerometerDataColumnInfo columnInfo, io.pslab.models.AccelerometerData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (io.pslab.models.AccelerometerData) cachedRealmObject;
        }

        io.pslab.models.AccelerometerData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(io.pslab.models.AccelerometerData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.io_pslab_models_AccelerometerDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static io.pslab.models.AccelerometerData copy(Realm realm, AccelerometerDataColumnInfo columnInfo, io.pslab.models.AccelerometerData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.pslab.models.AccelerometerData) cachedRealmObject;
        }

        io_pslab_models_AccelerometerDataRealmProxyInterface unmanagedSource = (io_pslab_models_AccelerometerDataRealmProxyInterface) newObject;

        Table table = realm.getTable(io.pslab.models.AccelerometerData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.timeColKey, unmanagedSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, unmanagedSource.realmGet$block());
        builder.addFloat(columnInfo.accelerometerXColKey, unmanagedSource.realmGet$accelerometerX());
        builder.addFloat(columnInfo.accelerometerYColKey, unmanagedSource.realmGet$accelerometerY());
        builder.addFloat(columnInfo.accelerometerZColKey, unmanagedSource.realmGet$accelerometerZ());
        builder.addDouble(columnInfo.latColKey, unmanagedSource.realmGet$lat());
        builder.addDouble(columnInfo.lonColKey, unmanagedSource.realmGet$lon());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.io_pslab_models_AccelerometerDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, io.pslab.models.AccelerometerData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.AccelerometerData.class);
        long tableNativePtr = table.getNativePtr();
        AccelerometerDataColumnInfo columnInfo = (AccelerometerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.AccelerometerData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$block(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerXColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerX(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerYColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerY(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerZColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerZ(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.AccelerometerData.class);
        long tableNativePtr = table.getNativePtr();
        AccelerometerDataColumnInfo columnInfo = (AccelerometerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.AccelerometerData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.AccelerometerData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.AccelerometerData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$block(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerXColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerX(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerYColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerY(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerZColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerZ(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, io.pslab.models.AccelerometerData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.AccelerometerData.class);
        long tableNativePtr = table.getNativePtr();
        AccelerometerDataColumnInfo columnInfo = (AccelerometerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.AccelerometerData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$block(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerXColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerX(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerYColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerY(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerZColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerZ(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.AccelerometerData.class);
        long tableNativePtr = table.getNativePtr();
        AccelerometerDataColumnInfo columnInfo = (AccelerometerDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.AccelerometerData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.AccelerometerData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.AccelerometerData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$time());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$block(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerXColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerX(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerYColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerY(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.accelerometerZColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$accelerometerZ(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_AccelerometerDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static io.pslab.models.AccelerometerData createDetachedCopy(io.pslab.models.AccelerometerData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.pslab.models.AccelerometerData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.pslab.models.AccelerometerData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.pslab.models.AccelerometerData) cachedObject.object;
            }
            unmanagedObject = (io.pslab.models.AccelerometerData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_pslab_models_AccelerometerDataRealmProxyInterface unmanagedCopy = (io_pslab_models_AccelerometerDataRealmProxyInterface) unmanagedObject;
        io_pslab_models_AccelerometerDataRealmProxyInterface realmSource = (io_pslab_models_AccelerometerDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$time(realmSource.realmGet$time());
        unmanagedCopy.realmSet$block(realmSource.realmGet$block());
        unmanagedCopy.realmSet$accelerometerX(realmSource.realmGet$accelerometerX());
        unmanagedCopy.realmSet$accelerometerY(realmSource.realmGet$accelerometerY());
        unmanagedCopy.realmSet$accelerometerZ(realmSource.realmGet$accelerometerZ());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());

        return unmanagedObject;
    }

    static io.pslab.models.AccelerometerData update(Realm realm, AccelerometerDataColumnInfo columnInfo, io.pslab.models.AccelerometerData realmObject, io.pslab.models.AccelerometerData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        io_pslab_models_AccelerometerDataRealmProxyInterface realmObjectTarget = (io_pslab_models_AccelerometerDataRealmProxyInterface) realmObject;
        io_pslab_models_AccelerometerDataRealmProxyInterface realmObjectSource = (io_pslab_models_AccelerometerDataRealmProxyInterface) newObject;
        Table table = realm.getTable(io.pslab.models.AccelerometerData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.timeColKey, realmObjectSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, realmObjectSource.realmGet$block());
        builder.addFloat(columnInfo.accelerometerXColKey, realmObjectSource.realmGet$accelerometerX());
        builder.addFloat(columnInfo.accelerometerYColKey, realmObjectSource.realmGet$accelerometerY());
        builder.addFloat(columnInfo.accelerometerZColKey, realmObjectSource.realmGet$accelerometerZ());
        builder.addDouble(columnInfo.latColKey, realmObjectSource.realmGet$lat());
        builder.addDouble(columnInfo.lonColKey, realmObjectSource.realmGet$lon());

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
        io_pslab_models_AccelerometerDataRealmProxy aAccelerometerData = (io_pslab_models_AccelerometerDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aAccelerometerData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAccelerometerData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aAccelerometerData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
