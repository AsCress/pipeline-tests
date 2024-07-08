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
public class io_pslab_models_SensorLoggedRealmProxy extends io.pslab.models.SensorLogged
    implements RealmObjectProxy, io_pslab_models_SensorLoggedRealmProxyInterface {

    static final class SensorLoggedColumnInfo extends ColumnInfo {
        long sensorColKey;
        long dateTimeStartColKey;
        long uniqueRefColKey;
        long latitudeColKey;
        long longitudeColKey;
        long dateTimeEndColKey;
        long timeZoneColKey;

        SensorLoggedColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("SensorLogged");
            this.sensorColKey = addColumnDetails("sensor", "sensor", objectSchemaInfo);
            this.dateTimeStartColKey = addColumnDetails("dateTimeStart", "dateTimeStart", objectSchemaInfo);
            this.uniqueRefColKey = addColumnDetails("uniqueRef", "uniqueRef", objectSchemaInfo);
            this.latitudeColKey = addColumnDetails("latitude", "latitude", objectSchemaInfo);
            this.longitudeColKey = addColumnDetails("longitude", "longitude", objectSchemaInfo);
            this.dateTimeEndColKey = addColumnDetails("dateTimeEnd", "dateTimeEnd", objectSchemaInfo);
            this.timeZoneColKey = addColumnDetails("timeZone", "timeZone", objectSchemaInfo);
        }

        SensorLoggedColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new SensorLoggedColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final SensorLoggedColumnInfo src = (SensorLoggedColumnInfo) rawSrc;
            final SensorLoggedColumnInfo dst = (SensorLoggedColumnInfo) rawDst;
            dst.sensorColKey = src.sensorColKey;
            dst.dateTimeStartColKey = src.dateTimeStartColKey;
            dst.uniqueRefColKey = src.uniqueRefColKey;
            dst.latitudeColKey = src.latitudeColKey;
            dst.longitudeColKey = src.longitudeColKey;
            dst.dateTimeEndColKey = src.dateTimeEndColKey;
            dst.timeZoneColKey = src.timeZoneColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private SensorLoggedColumnInfo columnInfo;
    private ProxyState<io.pslab.models.SensorLogged> proxyState;

    io_pslab_models_SensorLoggedRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (SensorLoggedColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.pslab.models.SensorLogged>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$sensor() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.sensorColKey);
    }

    @Override
    public void realmSet$sensor(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.sensorColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.sensorColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.sensorColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.sensorColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$dateTimeStart() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.dateTimeStartColKey);
    }

    @Override
    public void realmSet$dateTimeStart(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.dateTimeStartColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.dateTimeStartColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$uniqueRef() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.uniqueRefColKey);
    }

    @Override
    public void realmSet$uniqueRef(long value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'uniqueRef' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$latitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.latitudeColKey);
    }

    @Override
    public void realmSet$latitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.latitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.latitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$longitude() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.longitudeColKey);
    }

    @Override
    public void realmSet$longitude(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.longitudeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.longitudeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$dateTimeEnd() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.dateTimeEndColKey);
    }

    @Override
    public void realmSet$dateTimeEnd(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.dateTimeEndColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.dateTimeEndColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$timeZone() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.timeZoneColKey);
    }

    @Override
    public void realmSet$timeZone(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.timeZoneColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.timeZoneColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.timeZoneColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.timeZoneColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "SensorLogged", false, 7, 0);
        builder.addPersistedProperty(NO_ALIAS, "sensor", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "dateTimeStart", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "uniqueRef", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "latitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "longitude", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "dateTimeEnd", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "timeZone", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SensorLoggedColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new SensorLoggedColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "SensorLogged";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SensorLogged";
    }

    @SuppressWarnings("cast")
    public static io.pslab.models.SensorLogged createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.pslab.models.SensorLogged obj = null;
        if (update) {
            Table table = realm.getTable(io.pslab.models.SensorLogged.class);
            SensorLoggedColumnInfo columnInfo = (SensorLoggedColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SensorLogged.class);
            long pkColumnKey = columnInfo.uniqueRefColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("uniqueRef")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("uniqueRef"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(io.pslab.models.SensorLogged.class), false, Collections.<String> emptyList());
                    obj = new io.realm.io_pslab_models_SensorLoggedRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("uniqueRef")) {
                if (json.isNull("uniqueRef")) {
                    obj = (io.realm.io_pslab_models_SensorLoggedRealmProxy) realm.createObjectInternal(io.pslab.models.SensorLogged.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.io_pslab_models_SensorLoggedRealmProxy) realm.createObjectInternal(io.pslab.models.SensorLogged.class, json.getLong("uniqueRef"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'uniqueRef'.");
            }
        }

        final io_pslab_models_SensorLoggedRealmProxyInterface objProxy = (io_pslab_models_SensorLoggedRealmProxyInterface) obj;
        if (json.has("sensor")) {
            if (json.isNull("sensor")) {
                objProxy.realmSet$sensor(null);
            } else {
                objProxy.realmSet$sensor((String) json.getString("sensor"));
            }
        }
        if (json.has("dateTimeStart")) {
            if (json.isNull("dateTimeStart")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'dateTimeStart' to null.");
            } else {
                objProxy.realmSet$dateTimeStart((long) json.getLong("dateTimeStart"));
            }
        }
        if (json.has("latitude")) {
            if (json.isNull("latitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'latitude' to null.");
            } else {
                objProxy.realmSet$latitude((double) json.getDouble("latitude"));
            }
        }
        if (json.has("longitude")) {
            if (json.isNull("longitude")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'longitude' to null.");
            } else {
                objProxy.realmSet$longitude((double) json.getDouble("longitude"));
            }
        }
        if (json.has("dateTimeEnd")) {
            if (json.isNull("dateTimeEnd")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'dateTimeEnd' to null.");
            } else {
                objProxy.realmSet$dateTimeEnd((long) json.getLong("dateTimeEnd"));
            }
        }
        if (json.has("timeZone")) {
            if (json.isNull("timeZone")) {
                objProxy.realmSet$timeZone(null);
            } else {
                objProxy.realmSet$timeZone((String) json.getString("timeZone"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static io.pslab.models.SensorLogged createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final io.pslab.models.SensorLogged obj = new io.pslab.models.SensorLogged();
        final io_pslab_models_SensorLoggedRealmProxyInterface objProxy = (io_pslab_models_SensorLoggedRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("sensor")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sensor((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$sensor(null);
                }
            } else if (name.equals("dateTimeStart")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dateTimeStart((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dateTimeStart' to null.");
                }
            } else if (name.equals("uniqueRef")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$uniqueRef((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'uniqueRef' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("latitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$latitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'latitude' to null.");
                }
            } else if (name.equals("longitude")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$longitude((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'longitude' to null.");
                }
            } else if (name.equals("dateTimeEnd")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$dateTimeEnd((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dateTimeEnd' to null.");
                }
            } else if (name.equals("timeZone")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeZone((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$timeZone(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'uniqueRef'.");
        }
        return realm.copyToRealmOrUpdate(obj);
    }

    static io_pslab_models_SensorLoggedRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(io.pslab.models.SensorLogged.class), false, Collections.<String>emptyList());
        io.realm.io_pslab_models_SensorLoggedRealmProxy obj = new io.realm.io_pslab_models_SensorLoggedRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static io.pslab.models.SensorLogged copyOrUpdate(Realm realm, SensorLoggedColumnInfo columnInfo, io.pslab.models.SensorLogged object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (io.pslab.models.SensorLogged) cachedRealmObject;
        }

        io.pslab.models.SensorLogged realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(io.pslab.models.SensorLogged.class);
            long pkColumnKey = columnInfo.uniqueRefColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.io_pslab_models_SensorLoggedRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static io.pslab.models.SensorLogged copy(Realm realm, SensorLoggedColumnInfo columnInfo, io.pslab.models.SensorLogged newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.pslab.models.SensorLogged) cachedRealmObject;
        }

        io_pslab_models_SensorLoggedRealmProxyInterface unmanagedSource = (io_pslab_models_SensorLoggedRealmProxyInterface) newObject;

        Table table = realm.getTable(io.pslab.models.SensorLogged.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.sensorColKey, unmanagedSource.realmGet$sensor());
        builder.addInteger(columnInfo.dateTimeStartColKey, unmanagedSource.realmGet$dateTimeStart());
        builder.addInteger(columnInfo.uniqueRefColKey, unmanagedSource.realmGet$uniqueRef());
        builder.addDouble(columnInfo.latitudeColKey, unmanagedSource.realmGet$latitude());
        builder.addDouble(columnInfo.longitudeColKey, unmanagedSource.realmGet$longitude());
        builder.addInteger(columnInfo.dateTimeEndColKey, unmanagedSource.realmGet$dateTimeEnd());
        builder.addString(columnInfo.timeZoneColKey, unmanagedSource.realmGet$timeZone());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.io_pslab_models_SensorLoggedRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, io.pslab.models.SensorLogged object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.SensorLogged.class);
        long tableNativePtr = table.getNativePtr();
        SensorLoggedColumnInfo columnInfo = (SensorLoggedColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SensorLogged.class);
        long pkColumnKey = columnInfo.uniqueRefColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$sensor = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$sensor();
        if (realmGet$sensor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sensorColKey, objKey, realmGet$sensor, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeStartColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$dateTimeStart(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$longitude(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeEndColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$dateTimeEnd(), false);
        String realmGet$timeZone = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$timeZone();
        if (realmGet$timeZone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeZoneColKey, objKey, realmGet$timeZone, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.SensorLogged.class);
        long tableNativePtr = table.getNativePtr();
        SensorLoggedColumnInfo columnInfo = (SensorLoggedColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SensorLogged.class);
        long pkColumnKey = columnInfo.uniqueRefColKey;
        io.pslab.models.SensorLogged object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.SensorLogged) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$sensor = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$sensor();
            if (realmGet$sensor != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sensorColKey, objKey, realmGet$sensor, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeStartColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$dateTimeStart(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$longitude(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeEndColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$dateTimeEnd(), false);
            String realmGet$timeZone = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$timeZone();
            if (realmGet$timeZone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeZoneColKey, objKey, realmGet$timeZone, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, io.pslab.models.SensorLogged object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.SensorLogged.class);
        long tableNativePtr = table.getNativePtr();
        SensorLoggedColumnInfo columnInfo = (SensorLoggedColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SensorLogged.class);
        long pkColumnKey = columnInfo.uniqueRefColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef());
        }
        cache.put(object, objKey);
        String realmGet$sensor = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$sensor();
        if (realmGet$sensor != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.sensorColKey, objKey, realmGet$sensor, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.sensorColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeStartColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$dateTimeStart(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$latitude(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$longitude(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeEndColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$dateTimeEnd(), false);
        String realmGet$timeZone = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$timeZone();
        if (realmGet$timeZone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timeZoneColKey, objKey, realmGet$timeZone, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.timeZoneColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.SensorLogged.class);
        long tableNativePtr = table.getNativePtr();
        SensorLoggedColumnInfo columnInfo = (SensorLoggedColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.SensorLogged.class);
        long pkColumnKey = columnInfo.uniqueRefColKey;
        io.pslab.models.SensorLogged object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.SensorLogged) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$uniqueRef());
            }
            cache.put(object, objKey);
            String realmGet$sensor = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$sensor();
            if (realmGet$sensor != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.sensorColKey, objKey, realmGet$sensor, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.sensorColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeStartColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$dateTimeStart(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latitudeColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$latitude(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.longitudeColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$longitude(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.dateTimeEndColKey, objKey, ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$dateTimeEnd(), false);
            String realmGet$timeZone = ((io_pslab_models_SensorLoggedRealmProxyInterface) object).realmGet$timeZone();
            if (realmGet$timeZone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timeZoneColKey, objKey, realmGet$timeZone, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.timeZoneColKey, objKey, false);
            }
        }
    }

    public static io.pslab.models.SensorLogged createDetachedCopy(io.pslab.models.SensorLogged realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.pslab.models.SensorLogged unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.pslab.models.SensorLogged();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.pslab.models.SensorLogged) cachedObject.object;
            }
            unmanagedObject = (io.pslab.models.SensorLogged) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_pslab_models_SensorLoggedRealmProxyInterface unmanagedCopy = (io_pslab_models_SensorLoggedRealmProxyInterface) unmanagedObject;
        io_pslab_models_SensorLoggedRealmProxyInterface realmSource = (io_pslab_models_SensorLoggedRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$sensor(realmSource.realmGet$sensor());
        unmanagedCopy.realmSet$dateTimeStart(realmSource.realmGet$dateTimeStart());
        unmanagedCopy.realmSet$uniqueRef(realmSource.realmGet$uniqueRef());
        unmanagedCopy.realmSet$latitude(realmSource.realmGet$latitude());
        unmanagedCopy.realmSet$longitude(realmSource.realmGet$longitude());
        unmanagedCopy.realmSet$dateTimeEnd(realmSource.realmGet$dateTimeEnd());
        unmanagedCopy.realmSet$timeZone(realmSource.realmGet$timeZone());

        return unmanagedObject;
    }

    static io.pslab.models.SensorLogged update(Realm realm, SensorLoggedColumnInfo columnInfo, io.pslab.models.SensorLogged realmObject, io.pslab.models.SensorLogged newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        io_pslab_models_SensorLoggedRealmProxyInterface realmObjectTarget = (io_pslab_models_SensorLoggedRealmProxyInterface) realmObject;
        io_pslab_models_SensorLoggedRealmProxyInterface realmObjectSource = (io_pslab_models_SensorLoggedRealmProxyInterface) newObject;
        Table table = realm.getTable(io.pslab.models.SensorLogged.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.sensorColKey, realmObjectSource.realmGet$sensor());
        builder.addInteger(columnInfo.dateTimeStartColKey, realmObjectSource.realmGet$dateTimeStart());
        builder.addInteger(columnInfo.uniqueRefColKey, realmObjectSource.realmGet$uniqueRef());
        builder.addDouble(columnInfo.latitudeColKey, realmObjectSource.realmGet$latitude());
        builder.addDouble(columnInfo.longitudeColKey, realmObjectSource.realmGet$longitude());
        builder.addInteger(columnInfo.dateTimeEndColKey, realmObjectSource.realmGet$dateTimeEnd());
        builder.addString(columnInfo.timeZoneColKey, realmObjectSource.realmGet$timeZone());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("SensorLogged = proxy[");
        stringBuilder.append("{sensor:");
        stringBuilder.append(realmGet$sensor() != null ? realmGet$sensor() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dateTimeStart:");
        stringBuilder.append(realmGet$dateTimeStart());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{uniqueRef:");
        stringBuilder.append(realmGet$uniqueRef());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{latitude:");
        stringBuilder.append(realmGet$latitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{longitude:");
        stringBuilder.append(realmGet$longitude());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{dateTimeEnd:");
        stringBuilder.append(realmGet$dateTimeEnd());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeZone:");
        stringBuilder.append(realmGet$timeZone() != null ? realmGet$timeZone() : "null");
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
        io_pslab_models_SensorLoggedRealmProxy aSensorLogged = (io_pslab_models_SensorLoggedRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aSensorLogged.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aSensorLogged.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aSensorLogged.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
