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
public class io_pslab_models_SensorDataBlockRealmProxy extends io.pslab.models.SensorDataBlock
    implements RealmObjectProxy, io_pslab_models_SensorDataBlockRealmProxyInterface {

    static final class SensorDataBlockColumnInfo extends ColumnInfo {
        long blockColKey;
        long sensorTypeColKey;

        SensorDataBlockColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("SensorDataBlock");
            this.blockColKey = addColumnDetails("block", "block", objectSchemaInfo);
            this.sensorTypeColKey = addColumnDetails("sensorType", "sensorType", objectSchemaInfo);
        }

        SensorDataBlockColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SensorDataBlockColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SensorDataBlockColumnInfo src = (SensorDataBlockColumnInfo) rawSrc;
            final SensorDataBlockColumnInfo dst = (SensorDataBlockColumnInfo) rawDst;
            dst.blockColKey = src.blockColKey;
            dst.sensorTypeColKey = src.sensorTypeColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private SensorDataBlockColumnInfo columnInfo;
    private ProxyState<io.pslab.models.SensorDataBlock> proxyState;

    io_pslab_models_SensorDataBlockRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SensorDataBlockColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.pslab.models.SensorDataBlock>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
    public String realmGet$sensorType() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.sensorTypeColKey);
    }

    @Override
    public void realmSet$sensorType(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sensorTypeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.sensorTypeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sensorTypeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.sensorTypeColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "SensorDataBlock", false, 2, 0);
        builder.addPersistedProperty(NO_ALIAS, "block", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "sensorType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SensorDataBlockColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SensorDataBlockColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "SensorDataBlock";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SensorDataBlock";
    }

    @SuppressWarnings("cast")
    public static io.pslab.models.SensorDataBlock createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.pslab.models.SensorDataBlock obj = realm.createObjectInternal(io.pslab.models.SensorDataBlock.class, true, excludeFields);

        final io_pslab_models_SensorDataBlockRealmProxyInterface objProxy = (io_pslab_models_SensorDataBlockRealmProxyInterface) obj;
        if (json.has("block")) {
            if (json.isNull("block")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'block' to null.");
            } else {
                objProxy.realmSet$block((long) json.getLong("block"));
            }
        }
        if (json.has("sensorType")) {
            if (json.isNull("sensorType")) {
                objProxy.realmSet$sensorType(null);
            } else {
                objProxy.realmSet$sensorType((String) json.getString("sensorType"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static io.pslab.models.SensorDataBlock createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final io.pslab.models.SensorDataBlock obj = new io.pslab.models.SensorDataBlock();
        final io_pslab_models_SensorDataBlockRealmProxyInterface objProxy = (io_pslab_models_SensorDataBlockRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("block")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$block((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'block' to null.");
                }
            } else if (name.equals("sensorType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sensorType((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sensorType(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static io_pslab_models_SensorDataBlockRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(io.pslab.models.SensorDataBlock.class), false, Collections.<String>emptyList());
        io.realm.io_pslab_models_SensorDataBlockRealmProxy obj = new io.realm.io_pslab_models_SensorDataBlockRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static io.pslab.models.SensorDataBlock copyOrUpdate(Realm realm, SensorDataBlockColumnInfo columnInfo, io.pslab.models.SensorDataBlock object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (io.pslab.models.SensorDataBlock) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static io.pslab.models.SensorDataBlock copy(Realm realm, SensorDataBlockColumnInfo columnInfo, io.pslab.models.SensorDataBlock newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.pslab.models.SensorDataBlock) cachedRealmObject;
        }

        io_pslab_models_SensorDataBlockRealmProxyInterface unmanagedSource = (io_pslab_models_SensorDataBlockRealmProxyInterface) newObject;

        Table table = realm.getTable(io.pslab.models.SensorDataBlock.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.blockColKey, unmanagedSource.realmGet$block());
        builder.addString(columnInfo.sensorTypeColKey, unmanagedSource.realmGet$sensorType());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.io_pslab_models_SensorDataBlockRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, io.pslab.models.SensorDataBlock object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.SensorDataBlock.class);
        long tableNativePtr = table.getNativePtr();
        SensorDataBlockColumnInfo columnInfo = (SensorDataBlockColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SensorDataBlock.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_SensorDataBlockRealmProxyInterface) object).realmGet$block(), false);
        String realmGet$sensorType = ((io_pslab_models_SensorDataBlockRealmProxyInterface) object).realmGet$sensorType();
        if (realmGet$sensorType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sensorTypeColKey, objKey, realmGet$sensorType, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.SensorDataBlock.class);
        long tableNativePtr = table.getNativePtr();
        SensorDataBlockColumnInfo columnInfo = (SensorDataBlockColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SensorDataBlock.class);
        io.pslab.models.SensorDataBlock object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.SensorDataBlock) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_SensorDataBlockRealmProxyInterface) object).realmGet$block(), false);
            String realmGet$sensorType = ((io_pslab_models_SensorDataBlockRealmProxyInterface) object).realmGet$sensorType();
            if (realmGet$sensorType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sensorTypeColKey, objKey, realmGet$sensorType, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, io.pslab.models.SensorDataBlock object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.SensorDataBlock.class);
        long tableNativePtr = table.getNativePtr();
        SensorDataBlockColumnInfo columnInfo = (SensorDataBlockColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SensorDataBlock.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_SensorDataBlockRealmProxyInterface) object).realmGet$block(), false);
        String realmGet$sensorType = ((io_pslab_models_SensorDataBlockRealmProxyInterface) object).realmGet$sensorType();
        if (realmGet$sensorType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sensorTypeColKey, objKey, realmGet$sensorType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sensorTypeColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.SensorDataBlock.class);
        long tableNativePtr = table.getNativePtr();
        SensorDataBlockColumnInfo columnInfo = (SensorDataBlockColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SensorDataBlock.class);
        io.pslab.models.SensorDataBlock object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.SensorDataBlock) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_SensorDataBlockRealmProxyInterface) object).realmGet$block(), false);
            String realmGet$sensorType = ((io_pslab_models_SensorDataBlockRealmProxyInterface) object).realmGet$sensorType();
            if (realmGet$sensorType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sensorTypeColKey, objKey, realmGet$sensorType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sensorTypeColKey, objKey, false);
            }
        }
    }

    public static io.pslab.models.SensorDataBlock createDetachedCopy(io.pslab.models.SensorDataBlock realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.pslab.models.SensorDataBlock unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.pslab.models.SensorDataBlock();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.pslab.models.SensorDataBlock) cachedObject.object;
            }
            unmanagedObject = (io.pslab.models.SensorDataBlock) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_pslab_models_SensorDataBlockRealmProxyInterface unmanagedCopy = (io_pslab_models_SensorDataBlockRealmProxyInterface) unmanagedObject;
        io_pslab_models_SensorDataBlockRealmProxyInterface realmSource = (io_pslab_models_SensorDataBlockRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$block(realmSource.realmGet$block());
        unmanagedCopy.realmSet$sensorType(realmSource.realmGet$sensorType());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("SensorDataBlock = proxy[");
        stringBuilder.append("{block:");
        stringBuilder.append(realmGet$block());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sensorType:");
        stringBuilder.append(realmGet$sensorType() != null ? realmGet$sensorType() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
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
        io_pslab_models_SensorDataBlockRealmProxy aSensorDataBlock = (io_pslab_models_SensorDataBlockRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aSensorDataBlock.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSensorDataBlock.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aSensorDataBlock.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
