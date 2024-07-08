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
public class io_pslab_models_PowerSourceDataRealmProxy extends io.pslab.models.PowerSourceData
    implements RealmObjectProxy, io_pslab_models_PowerSourceDataRealmProxyInterface {

    static final class PowerSourceDataColumnInfo extends ColumnInfo {
        long timeColKey;
        long blockColKey;
        long pv1ColKey;
        long pv2ColKey;
        long pv3ColKey;
        long pcsColKey;
        long latColKey;
        long lonColKey;

        PowerSourceDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("PowerSourceData");
            this.timeColKey = addColumnDetails("time", "time", objectSchemaInfo);
            this.blockColKey = addColumnDetails("block", "block", objectSchemaInfo);
            this.pv1ColKey = addColumnDetails("pv1", "pv1", objectSchemaInfo);
            this.pv2ColKey = addColumnDetails("pv2", "pv2", objectSchemaInfo);
            this.pv3ColKey = addColumnDetails("pv3", "pv3", objectSchemaInfo);
            this.pcsColKey = addColumnDetails("pcs", "pcs", objectSchemaInfo);
            this.latColKey = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lonColKey = addColumnDetails("lon", "lon", objectSchemaInfo);
        }

        PowerSourceDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PowerSourceDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PowerSourceDataColumnInfo src = (PowerSourceDataColumnInfo) rawSrc;
            final PowerSourceDataColumnInfo dst = (PowerSourceDataColumnInfo) rawDst;
            dst.timeColKey = src.timeColKey;
            dst.blockColKey = src.blockColKey;
            dst.pv1ColKey = src.pv1ColKey;
            dst.pv2ColKey = src.pv2ColKey;
            dst.pv3ColKey = src.pv3ColKey;
            dst.pcsColKey = src.pcsColKey;
            dst.latColKey = src.latColKey;
            dst.lonColKey = src.lonColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private PowerSourceDataColumnInfo columnInfo;
    private ProxyState<io.pslab.models.PowerSourceData> proxyState;

    io_pslab_models_PowerSourceDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PowerSourceDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.pslab.models.PowerSourceData>(this);
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
    public float realmGet$pv1() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.pv1ColKey);
    }

    @Override
    public void realmSet$pv1(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.pv1ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.pv1ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$pv2() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.pv2ColKey);
    }

    @Override
    public void realmSet$pv2(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.pv2ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.pv2ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$pv3() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.pv3ColKey);
    }

    @Override
    public void realmSet$pv3(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.pv3ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.pv3ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public float realmGet$pcs() {
        proxyState.getRealm$realm().checkIfValid();
        return (float) proxyState.getRow$realm().getFloat(columnInfo.pcsColKey);
    }

    @Override
    public void realmSet$pcs(float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setFloat(columnInfo.pcsColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setFloat(columnInfo.pcsColKey, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "PowerSourceData", false, 8, 0);
        builder.addPersistedProperty(NO_ALIAS, "time", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "block", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "pv1", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "pv2", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "pv3", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "pcs", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PowerSourceDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new PowerSourceDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "PowerSourceData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PowerSourceData";
    }

    @SuppressWarnings("cast")
    public static io.pslab.models.PowerSourceData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.pslab.models.PowerSourceData obj = null;
        if (update) {
            Table table = realm.getTable(io.pslab.models.PowerSourceData.class);
            PowerSourceDataColumnInfo columnInfo = (PowerSourceDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.PowerSourceData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("time")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("time"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(io.pslab.models.PowerSourceData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.io_pslab_models_PowerSourceDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("time")) {
                if (json.isNull("time")) {
                    obj = (io.realm.io_pslab_models_PowerSourceDataRealmProxy) realm.createObjectInternal(io.pslab.models.PowerSourceData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.io_pslab_models_PowerSourceDataRealmProxy) realm.createObjectInternal(io.pslab.models.PowerSourceData.class, json.getLong("time"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'time'.");
            }
        }

        final io_pslab_models_PowerSourceDataRealmProxyInterface objProxy = (io_pslab_models_PowerSourceDataRealmProxyInterface) obj;
        if (json.has("block")) {
            if (json.isNull("block")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'block' to null.");
            } else {
                objProxy.realmSet$block((long) json.getLong("block"));
            }
        }
        if (json.has("pv1")) {
            if (json.isNull("pv1")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'pv1' to null.");
            } else {
                objProxy.realmSet$pv1((float) json.getDouble("pv1"));
            }
        }
        if (json.has("pv2")) {
            if (json.isNull("pv2")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'pv2' to null.");
            } else {
                objProxy.realmSet$pv2((float) json.getDouble("pv2"));
            }
        }
        if (json.has("pv3")) {
            if (json.isNull("pv3")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'pv3' to null.");
            } else {
                objProxy.realmSet$pv3((float) json.getDouble("pv3"));
            }
        }
        if (json.has("pcs")) {
            if (json.isNull("pcs")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'pcs' to null.");
            } else {
                objProxy.realmSet$pcs((float) json.getDouble("pcs"));
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
    public static io.pslab.models.PowerSourceData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final io.pslab.models.PowerSourceData obj = new io.pslab.models.PowerSourceData();
        final io_pslab_models_PowerSourceDataRealmProxyInterface objProxy = (io_pslab_models_PowerSourceDataRealmProxyInterface) obj;
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
            } else if (name.equals("pv1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pv1((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'pv1' to null.");
                }
            } else if (name.equals("pv2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pv2((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'pv2' to null.");
                }
            } else if (name.equals("pv3")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pv3((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'pv3' to null.");
                }
            } else if (name.equals("pcs")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$pcs((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'pcs' to null.");
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

    static io_pslab_models_PowerSourceDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(io.pslab.models.PowerSourceData.class), false, Collections.<String>emptyList());
        io.realm.io_pslab_models_PowerSourceDataRealmProxy obj = new io.realm.io_pslab_models_PowerSourceDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static io.pslab.models.PowerSourceData copyOrUpdate(Realm realm, PowerSourceDataColumnInfo columnInfo, io.pslab.models.PowerSourceData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (io.pslab.models.PowerSourceData) cachedRealmObject;
        }

        io.pslab.models.PowerSourceData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(io.pslab.models.PowerSourceData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.io_pslab_models_PowerSourceDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static io.pslab.models.PowerSourceData copy(Realm realm, PowerSourceDataColumnInfo columnInfo, io.pslab.models.PowerSourceData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.pslab.models.PowerSourceData) cachedRealmObject;
        }

        io_pslab_models_PowerSourceDataRealmProxyInterface unmanagedSource = (io_pslab_models_PowerSourceDataRealmProxyInterface) newObject;

        Table table = realm.getTable(io.pslab.models.PowerSourceData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.timeColKey, unmanagedSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, unmanagedSource.realmGet$block());
        builder.addFloat(columnInfo.pv1ColKey, unmanagedSource.realmGet$pv1());
        builder.addFloat(columnInfo.pv2ColKey, unmanagedSource.realmGet$pv2());
        builder.addFloat(columnInfo.pv3ColKey, unmanagedSource.realmGet$pv3());
        builder.addFloat(columnInfo.pcsColKey, unmanagedSource.realmGet$pcs());
        builder.addDouble(columnInfo.latColKey, unmanagedSource.realmGet$lat());
        builder.addDouble(columnInfo.lonColKey, unmanagedSource.realmGet$lon());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.io_pslab_models_PowerSourceDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, io.pslab.models.PowerSourceData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.PowerSourceData.class);
        long tableNativePtr = table.getNativePtr();
        PowerSourceDataColumnInfo columnInfo = (PowerSourceDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.PowerSourceData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$block(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.pv1ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.pv2ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.pv3ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.pcsColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pcs(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.PowerSourceData.class);
        long tableNativePtr = table.getNativePtr();
        PowerSourceDataColumnInfo columnInfo = (PowerSourceDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.PowerSourceData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.PowerSourceData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.PowerSourceData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$block(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.pv1ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.pv2ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.pv3ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.pcsColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pcs(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, io.pslab.models.PowerSourceData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.PowerSourceData.class);
        long tableNativePtr = table.getNativePtr();
        PowerSourceDataColumnInfo columnInfo = (PowerSourceDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.PowerSourceData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$block(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.pv1ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv1(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.pv2ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv2(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.pv3ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv3(), false);
        Table.nativeSetFloat(tableNativePtr, columnInfo.pcsColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pcs(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.PowerSourceData.class);
        long tableNativePtr = table.getNativePtr();
        PowerSourceDataColumnInfo columnInfo = (PowerSourceDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.PowerSourceData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.PowerSourceData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.PowerSourceData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$time());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$block(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.pv1ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv1(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.pv2ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv2(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.pv3ColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pv3(), false);
            Table.nativeSetFloat(tableNativePtr, columnInfo.pcsColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$pcs(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_PowerSourceDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static io.pslab.models.PowerSourceData createDetachedCopy(io.pslab.models.PowerSourceData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.pslab.models.PowerSourceData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.pslab.models.PowerSourceData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.pslab.models.PowerSourceData) cachedObject.object;
            }
            unmanagedObject = (io.pslab.models.PowerSourceData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_pslab_models_PowerSourceDataRealmProxyInterface unmanagedCopy = (io_pslab_models_PowerSourceDataRealmProxyInterface) unmanagedObject;
        io_pslab_models_PowerSourceDataRealmProxyInterface realmSource = (io_pslab_models_PowerSourceDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$time(realmSource.realmGet$time());
        unmanagedCopy.realmSet$block(realmSource.realmGet$block());
        unmanagedCopy.realmSet$pv1(realmSource.realmGet$pv1());
        unmanagedCopy.realmSet$pv2(realmSource.realmGet$pv2());
        unmanagedCopy.realmSet$pv3(realmSource.realmGet$pv3());
        unmanagedCopy.realmSet$pcs(realmSource.realmGet$pcs());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());

        return unmanagedObject;
    }

    static io.pslab.models.PowerSourceData update(Realm realm, PowerSourceDataColumnInfo columnInfo, io.pslab.models.PowerSourceData realmObject, io.pslab.models.PowerSourceData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        io_pslab_models_PowerSourceDataRealmProxyInterface realmObjectTarget = (io_pslab_models_PowerSourceDataRealmProxyInterface) realmObject;
        io_pslab_models_PowerSourceDataRealmProxyInterface realmObjectSource = (io_pslab_models_PowerSourceDataRealmProxyInterface) newObject;
        Table table = realm.getTable(io.pslab.models.PowerSourceData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.timeColKey, realmObjectSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, realmObjectSource.realmGet$block());
        builder.addFloat(columnInfo.pv1ColKey, realmObjectSource.realmGet$pv1());
        builder.addFloat(columnInfo.pv2ColKey, realmObjectSource.realmGet$pv2());
        builder.addFloat(columnInfo.pv3ColKey, realmObjectSource.realmGet$pv3());
        builder.addFloat(columnInfo.pcsColKey, realmObjectSource.realmGet$pcs());
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
        io_pslab_models_PowerSourceDataRealmProxy aPowerSourceData = (io_pslab_models_PowerSourceDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aPowerSourceData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPowerSourceData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aPowerSourceData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
