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
public class io_pslab_models_ServoDataRealmProxy extends io.pslab.models.ServoData
    implements RealmObjectProxy, io_pslab_models_ServoDataRealmProxyInterface {

    static final class ServoDataColumnInfo extends ColumnInfo {
        long timeColKey;
        long blockColKey;
        long degree1ColKey;
        long degree2ColKey;
        long degree3ColKey;
        long degree4ColKey;
        long latColKey;
        long lonColKey;

        ServoDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("ServoData");
            this.timeColKey = addColumnDetails("time", "time", objectSchemaInfo);
            this.blockColKey = addColumnDetails("block", "block", objectSchemaInfo);
            this.degree1ColKey = addColumnDetails("degree1", "degree1", objectSchemaInfo);
            this.degree2ColKey = addColumnDetails("degree2", "degree2", objectSchemaInfo);
            this.degree3ColKey = addColumnDetails("degree3", "degree3", objectSchemaInfo);
            this.degree4ColKey = addColumnDetails("degree4", "degree4", objectSchemaInfo);
            this.latColKey = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lonColKey = addColumnDetails("lon", "lon", objectSchemaInfo);
        }

        ServoDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ServoDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ServoDataColumnInfo src = (ServoDataColumnInfo) rawSrc;
            final ServoDataColumnInfo dst = (ServoDataColumnInfo) rawDst;
            dst.timeColKey = src.timeColKey;
            dst.blockColKey = src.blockColKey;
            dst.degree1ColKey = src.degree1ColKey;
            dst.degree2ColKey = src.degree2ColKey;
            dst.degree3ColKey = src.degree3ColKey;
            dst.degree4ColKey = src.degree4ColKey;
            dst.latColKey = src.latColKey;
            dst.lonColKey = src.lonColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ServoDataColumnInfo columnInfo;
    private ProxyState<io.pslab.models.ServoData> proxyState;

    io_pslab_models_ServoDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ServoDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.pslab.models.ServoData>(this);
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
    public String realmGet$degree1() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.degree1ColKey);
    }

    @Override
    public void realmSet$degree1(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.degree1ColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.degree1ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.degree1ColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.degree1ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$degree2() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.degree2ColKey);
    }

    @Override
    public void realmSet$degree2(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.degree2ColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.degree2ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.degree2ColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.degree2ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$degree3() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.degree3ColKey);
    }

    @Override
    public void realmSet$degree3(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.degree3ColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.degree3ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.degree3ColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.degree3ColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$degree4() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.degree4ColKey);
    }

    @Override
    public void realmSet$degree4(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.degree4ColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.degree4ColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.degree4ColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.degree4ColKey, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "ServoData", false, 8, 0);
        builder.addPersistedProperty(NO_ALIAS, "time", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "block", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "degree1", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "degree2", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "degree3", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "degree4", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ServoDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ServoDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "ServoData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ServoData";
    }

    @SuppressWarnings("cast")
    public static io.pslab.models.ServoData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.pslab.models.ServoData obj = null;
        if (update) {
            Table table = realm.getTable(io.pslab.models.ServoData.class);
            ServoDataColumnInfo columnInfo = (ServoDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.ServoData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("time")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("time"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(io.pslab.models.ServoData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.io_pslab_models_ServoDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("time")) {
                if (json.isNull("time")) {
                    obj = (io.realm.io_pslab_models_ServoDataRealmProxy) realm.createObjectInternal(io.pslab.models.ServoData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.io_pslab_models_ServoDataRealmProxy) realm.createObjectInternal(io.pslab.models.ServoData.class, json.getLong("time"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'time'.");
            }
        }

        final io_pslab_models_ServoDataRealmProxyInterface objProxy = (io_pslab_models_ServoDataRealmProxyInterface) obj;
        if (json.has("block")) {
            if (json.isNull("block")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'block' to null.");
            } else {
                objProxy.realmSet$block((long) json.getLong("block"));
            }
        }
        if (json.has("degree1")) {
            if (json.isNull("degree1")) {
                objProxy.realmSet$degree1(null);
            } else {
                objProxy.realmSet$degree1((String) json.getString("degree1"));
            }
        }
        if (json.has("degree2")) {
            if (json.isNull("degree2")) {
                objProxy.realmSet$degree2(null);
            } else {
                objProxy.realmSet$degree2((String) json.getString("degree2"));
            }
        }
        if (json.has("degree3")) {
            if (json.isNull("degree3")) {
                objProxy.realmSet$degree3(null);
            } else {
                objProxy.realmSet$degree3((String) json.getString("degree3"));
            }
        }
        if (json.has("degree4")) {
            if (json.isNull("degree4")) {
                objProxy.realmSet$degree4(null);
            } else {
                objProxy.realmSet$degree4((String) json.getString("degree4"));
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
    public static io.pslab.models.ServoData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final io.pslab.models.ServoData obj = new io.pslab.models.ServoData();
        final io_pslab_models_ServoDataRealmProxyInterface objProxy = (io_pslab_models_ServoDataRealmProxyInterface) obj;
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
            } else if (name.equals("degree1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$degree1((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$degree1(null);
                }
            } else if (name.equals("degree2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$degree2((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$degree2(null);
                }
            } else if (name.equals("degree3")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$degree3((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$degree3(null);
                }
            } else if (name.equals("degree4")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$degree4((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$degree4(null);
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

    static io_pslab_models_ServoDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(io.pslab.models.ServoData.class), false, Collections.<String>emptyList());
        io.realm.io_pslab_models_ServoDataRealmProxy obj = new io.realm.io_pslab_models_ServoDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static io.pslab.models.ServoData copyOrUpdate(Realm realm, ServoDataColumnInfo columnInfo, io.pslab.models.ServoData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (io.pslab.models.ServoData) cachedRealmObject;
        }

        io.pslab.models.ServoData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(io.pslab.models.ServoData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.io_pslab_models_ServoDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static io.pslab.models.ServoData copy(Realm realm, ServoDataColumnInfo columnInfo, io.pslab.models.ServoData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.pslab.models.ServoData) cachedRealmObject;
        }

        io_pslab_models_ServoDataRealmProxyInterface unmanagedSource = (io_pslab_models_ServoDataRealmProxyInterface) newObject;

        Table table = realm.getTable(io.pslab.models.ServoData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.timeColKey, unmanagedSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, unmanagedSource.realmGet$block());
        builder.addString(columnInfo.degree1ColKey, unmanagedSource.realmGet$degree1());
        builder.addString(columnInfo.degree2ColKey, unmanagedSource.realmGet$degree2());
        builder.addString(columnInfo.degree3ColKey, unmanagedSource.realmGet$degree3());
        builder.addString(columnInfo.degree4ColKey, unmanagedSource.realmGet$degree4());
        builder.addDouble(columnInfo.latColKey, unmanagedSource.realmGet$lat());
        builder.addDouble(columnInfo.lonColKey, unmanagedSource.realmGet$lon());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.io_pslab_models_ServoDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, io.pslab.models.ServoData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.ServoData.class);
        long tableNativePtr = table.getNativePtr();
        ServoDataColumnInfo columnInfo = (ServoDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.ServoData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$block(), false);
        String realmGet$degree1 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree1();
        if (realmGet$degree1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.degree1ColKey, objKey, realmGet$degree1, false);
        }
        String realmGet$degree2 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree2();
        if (realmGet$degree2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.degree2ColKey, objKey, realmGet$degree2, false);
        }
        String realmGet$degree3 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree3();
        if (realmGet$degree3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.degree3ColKey, objKey, realmGet$degree3, false);
        }
        String realmGet$degree4 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree4();
        if (realmGet$degree4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.degree4ColKey, objKey, realmGet$degree4, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.ServoData.class);
        long tableNativePtr = table.getNativePtr();
        ServoDataColumnInfo columnInfo = (ServoDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.ServoData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.ServoData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.ServoData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$block(), false);
            String realmGet$degree1 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree1();
            if (realmGet$degree1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.degree1ColKey, objKey, realmGet$degree1, false);
            }
            String realmGet$degree2 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree2();
            if (realmGet$degree2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.degree2ColKey, objKey, realmGet$degree2, false);
            }
            String realmGet$degree3 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree3();
            if (realmGet$degree3 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.degree3ColKey, objKey, realmGet$degree3, false);
            }
            String realmGet$degree4 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree4();
            if (realmGet$degree4 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.degree4ColKey, objKey, realmGet$degree4, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, io.pslab.models.ServoData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.ServoData.class);
        long tableNativePtr = table.getNativePtr();
        ServoDataColumnInfo columnInfo = (ServoDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.ServoData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$block(), false);
        String realmGet$degree1 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree1();
        if (realmGet$degree1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.degree1ColKey, objKey, realmGet$degree1, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.degree1ColKey, objKey, false);
        }
        String realmGet$degree2 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree2();
        if (realmGet$degree2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.degree2ColKey, objKey, realmGet$degree2, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.degree2ColKey, objKey, false);
        }
        String realmGet$degree3 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree3();
        if (realmGet$degree3 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.degree3ColKey, objKey, realmGet$degree3, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.degree3ColKey, objKey, false);
        }
        String realmGet$degree4 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree4();
        if (realmGet$degree4 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.degree4ColKey, objKey, realmGet$degree4, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.degree4ColKey, objKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.ServoData.class);
        long tableNativePtr = table.getNativePtr();
        ServoDataColumnInfo columnInfo = (ServoDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.ServoData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.ServoData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.ServoData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$time());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$block(), false);
            String realmGet$degree1 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree1();
            if (realmGet$degree1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.degree1ColKey, objKey, realmGet$degree1, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.degree1ColKey, objKey, false);
            }
            String realmGet$degree2 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree2();
            if (realmGet$degree2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.degree2ColKey, objKey, realmGet$degree2, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.degree2ColKey, objKey, false);
            }
            String realmGet$degree3 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree3();
            if (realmGet$degree3 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.degree3ColKey, objKey, realmGet$degree3, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.degree3ColKey, objKey, false);
            }
            String realmGet$degree4 = ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$degree4();
            if (realmGet$degree4 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.degree4ColKey, objKey, realmGet$degree4, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.degree4ColKey, objKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_ServoDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static io.pslab.models.ServoData createDetachedCopy(io.pslab.models.ServoData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.pslab.models.ServoData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.pslab.models.ServoData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.pslab.models.ServoData) cachedObject.object;
            }
            unmanagedObject = (io.pslab.models.ServoData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_pslab_models_ServoDataRealmProxyInterface unmanagedCopy = (io_pslab_models_ServoDataRealmProxyInterface) unmanagedObject;
        io_pslab_models_ServoDataRealmProxyInterface realmSource = (io_pslab_models_ServoDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$time(realmSource.realmGet$time());
        unmanagedCopy.realmSet$block(realmSource.realmGet$block());
        unmanagedCopy.realmSet$degree1(realmSource.realmGet$degree1());
        unmanagedCopy.realmSet$degree2(realmSource.realmGet$degree2());
        unmanagedCopy.realmSet$degree3(realmSource.realmGet$degree3());
        unmanagedCopy.realmSet$degree4(realmSource.realmGet$degree4());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());

        return unmanagedObject;
    }

    static io.pslab.models.ServoData update(Realm realm, ServoDataColumnInfo columnInfo, io.pslab.models.ServoData realmObject, io.pslab.models.ServoData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        io_pslab_models_ServoDataRealmProxyInterface realmObjectTarget = (io_pslab_models_ServoDataRealmProxyInterface) realmObject;
        io_pslab_models_ServoDataRealmProxyInterface realmObjectSource = (io_pslab_models_ServoDataRealmProxyInterface) newObject;
        Table table = realm.getTable(io.pslab.models.ServoData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.timeColKey, realmObjectSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, realmObjectSource.realmGet$block());
        builder.addString(columnInfo.degree1ColKey, realmObjectSource.realmGet$degree1());
        builder.addString(columnInfo.degree2ColKey, realmObjectSource.realmGet$degree2());
        builder.addString(columnInfo.degree3ColKey, realmObjectSource.realmGet$degree3());
        builder.addString(columnInfo.degree4ColKey, realmObjectSource.realmGet$degree4());
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
        io_pslab_models_ServoDataRealmProxy aServoData = (io_pslab_models_ServoDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aServoData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aServoData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aServoData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
