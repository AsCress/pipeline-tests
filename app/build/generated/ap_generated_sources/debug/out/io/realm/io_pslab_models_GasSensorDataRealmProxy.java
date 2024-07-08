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
public class io_pslab_models_GasSensorDataRealmProxy extends io.pslab.models.GasSensorData
    implements RealmObjectProxy, io_pslab_models_GasSensorDataRealmProxyInterface {

    static final class GasSensorDataColumnInfo extends ColumnInfo {
        long timeColKey;
        long blockColKey;
        long ppmValueColKey;
        long latColKey;
        long lonColKey;

        GasSensorDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("GasSensorData");
            this.timeColKey = addColumnDetails("time", "time", objectSchemaInfo);
            this.blockColKey = addColumnDetails("block", "block", objectSchemaInfo);
            this.ppmValueColKey = addColumnDetails("ppmValue", "ppmValue", objectSchemaInfo);
            this.latColKey = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lonColKey = addColumnDetails("lon", "lon", objectSchemaInfo);
        }

        GasSensorDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GasSensorDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GasSensorDataColumnInfo src = (GasSensorDataColumnInfo) rawSrc;
            final GasSensorDataColumnInfo dst = (GasSensorDataColumnInfo) rawDst;
            dst.timeColKey = src.timeColKey;
            dst.blockColKey = src.blockColKey;
            dst.ppmValueColKey = src.ppmValueColKey;
            dst.latColKey = src.latColKey;
            dst.lonColKey = src.lonColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private GasSensorDataColumnInfo columnInfo;
    private ProxyState<io.pslab.models.GasSensorData> proxyState;

    io_pslab_models_GasSensorDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GasSensorDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.pslab.models.GasSensorData>(this);
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
    public float realmGet$ppmValue() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ppmValueColKey);
    }

    @Override
    public void realmSet$ppmValue(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.ppmValueColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.ppmValueColKey, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "GasSensorData", false, 5, 0);
        builder.addPersistedProperty(NO_ALIAS, "time", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "block", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "ppmValue", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GasSensorDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new GasSensorDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "GasSensorData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "GasSensorData";
    }

    @SuppressWarnings("cast")
    public static io.pslab.models.GasSensorData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.pslab.models.GasSensorData obj = null;
        if (update) {
            Table table = realm.getTable(io.pslab.models.GasSensorData.class);
            GasSensorDataColumnInfo columnInfo = (GasSensorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.GasSensorData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("time")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("time"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(io.pslab.models.GasSensorData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.io_pslab_models_GasSensorDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("time")) {
                if (json.isNull("time")) {
                    obj = (io.realm.io_pslab_models_GasSensorDataRealmProxy) realm.createObjectInternal(io.pslab.models.GasSensorData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.io_pslab_models_GasSensorDataRealmProxy) realm.createObjectInternal(io.pslab.models.GasSensorData.class, json.getLong("time"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'time'.");
            }
        }

        final io_pslab_models_GasSensorDataRealmProxyInterface objProxy = (io_pslab_models_GasSensorDataRealmProxyInterface) obj;
        if (json.has("block")) {
            if (json.isNull("block")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'block' to null.");
            } else {
                objProxy.realmSet$block((long) json.getLong("block"));
            }
        }
        if (json.has("ppmValue")) {
            if (json.isNull("ppmValue")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ppmValue' to null.");
            } else {
                objProxy.realmSet$ppmValue((float) json.getDouble("ppmValue"));
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
    public static io.pslab.models.GasSensorData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final io.pslab.models.GasSensorData obj = new io.pslab.models.GasSensorData();
        final io_pslab_models_GasSensorDataRealmProxyInterface objProxy = (io_pslab_models_GasSensorDataRealmProxyInterface) obj;
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
            } else if (name.equals("ppmValue")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ppmValue((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ppmValue' to null.");
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

    static io_pslab_models_GasSensorDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(io.pslab.models.GasSensorData.class), false, Collections.<String>emptyList());
        io.realm.io_pslab_models_GasSensorDataRealmProxy obj = new io.realm.io_pslab_models_GasSensorDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static io.pslab.models.GasSensorData copyOrUpdate(Realm realm, GasSensorDataColumnInfo columnInfo, io.pslab.models.GasSensorData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (io.pslab.models.GasSensorData) cachedRealmObject;
        }

        io.pslab.models.GasSensorData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(io.pslab.models.GasSensorData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.io_pslab_models_GasSensorDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static io.pslab.models.GasSensorData copy(Realm realm, GasSensorDataColumnInfo columnInfo, io.pslab.models.GasSensorData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.pslab.models.GasSensorData) cachedRealmObject;
        }

        io_pslab_models_GasSensorDataRealmProxyInterface unmanagedSource = (io_pslab_models_GasSensorDataRealmProxyInterface) newObject;

        Table table = realm.getTable(io.pslab.models.GasSensorData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.timeColKey, unmanagedSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, unmanagedSource.realmGet$block());
        builder.addFloat(columnInfo.ppmValueColKey, unmanagedSource.realmGet$ppmValue());
        builder.addDouble(columnInfo.latColKey, unmanagedSource.realmGet$lat());
        builder.addDouble(columnInfo.lonColKey, unmanagedSource.realmGet$lon());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.io_pslab_models_GasSensorDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, io.pslab.models.GasSensorData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.GasSensorData.class);
        long tableNativePtr = table.getNativePtr();
        GasSensorDataColumnInfo columnInfo = (GasSensorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.GasSensorData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$block(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ppmValueColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$ppmValue(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.GasSensorData.class);
        long tableNativePtr = table.getNativePtr();
        GasSensorDataColumnInfo columnInfo = (GasSensorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.GasSensorData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.GasSensorData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.GasSensorData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$block(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ppmValueColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$ppmValue(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, io.pslab.models.GasSensorData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.GasSensorData.class);
        long tableNativePtr = table.getNativePtr();
        GasSensorDataColumnInfo columnInfo = (GasSensorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.GasSensorData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$block(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.ppmValueColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$ppmValue(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.GasSensorData.class);
        long tableNativePtr = table.getNativePtr();
        GasSensorDataColumnInfo columnInfo = (GasSensorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.GasSensorData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.GasSensorData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.GasSensorData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$time());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$block(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.ppmValueColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$ppmValue(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_GasSensorDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static io.pslab.models.GasSensorData createDetachedCopy(io.pslab.models.GasSensorData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.pslab.models.GasSensorData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.pslab.models.GasSensorData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.pslab.models.GasSensorData) cachedObject.object;
            }
            unmanagedObject = (io.pslab.models.GasSensorData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_pslab_models_GasSensorDataRealmProxyInterface unmanagedCopy = (io_pslab_models_GasSensorDataRealmProxyInterface) unmanagedObject;
        io_pslab_models_GasSensorDataRealmProxyInterface realmSource = (io_pslab_models_GasSensorDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$time(realmSource.realmGet$time());
        unmanagedCopy.realmSet$block(realmSource.realmGet$block());
        unmanagedCopy.realmSet$ppmValue(realmSource.realmGet$ppmValue());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());

        return unmanagedObject;
    }

    static io.pslab.models.GasSensorData update(Realm realm, GasSensorDataColumnInfo columnInfo, io.pslab.models.GasSensorData realmObject, io.pslab.models.GasSensorData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        io_pslab_models_GasSensorDataRealmProxyInterface realmObjectTarget = (io_pslab_models_GasSensorDataRealmProxyInterface) realmObject;
        io_pslab_models_GasSensorDataRealmProxyInterface realmObjectSource = (io_pslab_models_GasSensorDataRealmProxyInterface) newObject;
        Table table = realm.getTable(io.pslab.models.GasSensorData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.timeColKey, realmObjectSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, realmObjectSource.realmGet$block());
        builder.addFloat(columnInfo.ppmValueColKey, realmObjectSource.realmGet$ppmValue());
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
        io_pslab_models_GasSensorDataRealmProxy aGasSensorData = (io_pslab_models_GasSensorDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aGasSensorData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aGasSensorData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aGasSensorData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
