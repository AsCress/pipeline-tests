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
public class io_pslab_models_CompassDataRealmProxy extends io.pslab.models.CompassData
    implements RealmObjectProxy, io_pslab_models_CompassDataRealmProxyInterface {

    static final class CompassDataColumnInfo extends ColumnInfo {
        long BxColKey;
        long ByColKey;
        long BzColKey;
        long AxisColKey;
        long timeColKey;
        long blockColKey;
        long latColKey;
        long lonColKey;

        CompassDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("CompassData");
            this.BxColKey = addColumnDetails("Bx", "Bx", objectSchemaInfo);
            this.ByColKey = addColumnDetails("By", "By", objectSchemaInfo);
            this.BzColKey = addColumnDetails("Bz", "Bz", objectSchemaInfo);
            this.AxisColKey = addColumnDetails("Axis", "Axis", objectSchemaInfo);
            this.timeColKey = addColumnDetails("time", "time", objectSchemaInfo);
            this.blockColKey = addColumnDetails("block", "block", objectSchemaInfo);
            this.latColKey = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lonColKey = addColumnDetails("lon", "lon", objectSchemaInfo);
        }

        CompassDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CompassDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CompassDataColumnInfo src = (CompassDataColumnInfo) rawSrc;
            final CompassDataColumnInfo dst = (CompassDataColumnInfo) rawDst;
            dst.BxColKey = src.BxColKey;
            dst.ByColKey = src.ByColKey;
            dst.BzColKey = src.BzColKey;
            dst.AxisColKey = src.AxisColKey;
            dst.timeColKey = src.timeColKey;
            dst.blockColKey = src.blockColKey;
            dst.latColKey = src.latColKey;
            dst.lonColKey = src.lonColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CompassDataColumnInfo columnInfo;
    private ProxyState<io.pslab.models.CompassData> proxyState;

    io_pslab_models_CompassDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CompassDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.pslab.models.CompassData>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$Bx() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.BxColKey)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.BxColKey);
    }

    @Override
    public void realmSet$Bx(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.BxColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.BxColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.BxColKey);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.BxColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$By() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.ByColKey)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.ByColKey);
    }

    @Override
    public void realmSet$By(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.ByColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.ByColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.ByColKey);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.ByColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Float realmGet$Bz() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.BzColKey)) {
            return null;
        }
        return (float) proxyState.getRow$realm().getFloat(columnInfo.BzColKey);
    }

    @Override
    public void realmSet$Bz(Float value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.BzColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setFloat(columnInfo.BzColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.BzColKey);
            return;
        }
        proxyState.getRow$realm().setFloat(columnInfo.BzColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$Axis() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.AxisColKey);
    }

    @Override
    public void realmSet$Axis(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.AxisColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.AxisColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.AxisColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.AxisColKey, value);
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
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timeColKey, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "CompassData", false, 8, 0);
        builder.addPersistedProperty(NO_ALIAS, "Bx", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "By", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "Bz", RealmFieldType.FLOAT, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "Axis", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "time", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "block", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CompassDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CompassDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "CompassData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CompassData";
    }

    @SuppressWarnings("cast")
    public static io.pslab.models.CompassData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.pslab.models.CompassData obj = realm.createObjectInternal(io.pslab.models.CompassData.class, true, excludeFields);

        final io_pslab_models_CompassDataRealmProxyInterface objProxy = (io_pslab_models_CompassDataRealmProxyInterface) obj;
        if (json.has("Bx")) {
            if (json.isNull("Bx")) {
                objProxy.realmSet$Bx(null);
            } else {
                objProxy.realmSet$Bx((float) json.getDouble("Bx"));
            }
        }
        if (json.has("By")) {
            if (json.isNull("By")) {
                objProxy.realmSet$By(null);
            } else {
                objProxy.realmSet$By((float) json.getDouble("By"));
            }
        }
        if (json.has("Bz")) {
            if (json.isNull("Bz")) {
                objProxy.realmSet$Bz(null);
            } else {
                objProxy.realmSet$Bz((float) json.getDouble("Bz"));
            }
        }
        if (json.has("Axis")) {
            if (json.isNull("Axis")) {
                objProxy.realmSet$Axis(null);
            } else {
                objProxy.realmSet$Axis((String) json.getString("Axis"));
            }
        }
        if (json.has("time")) {
            if (json.isNull("time")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'time' to null.");
            } else {
                objProxy.realmSet$time((long) json.getLong("time"));
            }
        }
        if (json.has("block")) {
            if (json.isNull("block")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'block' to null.");
            } else {
                objProxy.realmSet$block((long) json.getLong("block"));
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
    public static io.pslab.models.CompassData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final io.pslab.models.CompassData obj = new io.pslab.models.CompassData();
        final io_pslab_models_CompassDataRealmProxyInterface objProxy = (io_pslab_models_CompassDataRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("Bx")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Bx((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$Bx(null);
                }
            } else if (name.equals("By")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$By((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$By(null);
                }
            } else if (name.equals("Bz")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Bz((float) reader.nextDouble());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$Bz(null);
                }
            } else if (name.equals("Axis")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Axis((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$Axis(null);
                }
            } else if (name.equals("time")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$time((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'time' to null.");
                }
            } else if (name.equals("block")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$block((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'block' to null.");
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
        return realm.copyToRealm(obj);
    }

    static io_pslab_models_CompassDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(io.pslab.models.CompassData.class), false, Collections.<String>emptyList());
        io.realm.io_pslab_models_CompassDataRealmProxy obj = new io.realm.io_pslab_models_CompassDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static io.pslab.models.CompassData copyOrUpdate(Realm realm, CompassDataColumnInfo columnInfo, io.pslab.models.CompassData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (io.pslab.models.CompassData) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static io.pslab.models.CompassData copy(Realm realm, CompassDataColumnInfo columnInfo, io.pslab.models.CompassData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.pslab.models.CompassData) cachedRealmObject;
        }

        io_pslab_models_CompassDataRealmProxyInterface unmanagedSource = (io_pslab_models_CompassDataRealmProxyInterface) newObject;

        Table table = realm.getTable(io.pslab.models.CompassData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addFloat(columnInfo.BxColKey, unmanagedSource.realmGet$Bx());
        builder.addFloat(columnInfo.ByColKey, unmanagedSource.realmGet$By());
        builder.addFloat(columnInfo.BzColKey, unmanagedSource.realmGet$Bz());
        builder.addString(columnInfo.AxisColKey, unmanagedSource.realmGet$Axis());
        builder.addInteger(columnInfo.timeColKey, unmanagedSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, unmanagedSource.realmGet$block());
        builder.addDouble(columnInfo.latColKey, unmanagedSource.realmGet$lat());
        builder.addDouble(columnInfo.lonColKey, unmanagedSource.realmGet$lon());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.io_pslab_models_CompassDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, io.pslab.models.CompassData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.CompassData.class);
        long tableNativePtr = table.getNativePtr();
        CompassDataColumnInfo columnInfo = (CompassDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.CompassData.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Float realmGet$Bx = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Bx();
        if (realmGet$Bx != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.BxColKey, objKey, realmGet$Bx, false);
        }
        Float realmGet$By = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$By();
        if (realmGet$By != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.ByColKey, objKey, realmGet$By, false);
        }
        Float realmGet$Bz = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Bz();
        if (realmGet$Bz != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.BzColKey, objKey, realmGet$Bz, false);
        }
        String realmGet$Axis = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Axis();
        if (realmGet$Axis != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.AxisColKey, objKey, realmGet$Axis, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$time(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$block(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.CompassData.class);
        long tableNativePtr = table.getNativePtr();
        CompassDataColumnInfo columnInfo = (CompassDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.CompassData.class);
        io.pslab.models.CompassData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.CompassData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Float realmGet$Bx = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Bx();
            if (realmGet$Bx != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.BxColKey, objKey, realmGet$Bx, false);
            }
            Float realmGet$By = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$By();
            if (realmGet$By != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.ByColKey, objKey, realmGet$By, false);
            }
            Float realmGet$Bz = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Bz();
            if (realmGet$Bz != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.BzColKey, objKey, realmGet$Bz, false);
            }
            String realmGet$Axis = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Axis();
            if (realmGet$Axis != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.AxisColKey, objKey, realmGet$Axis, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$time(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$block(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, io.pslab.models.CompassData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.CompassData.class);
        long tableNativePtr = table.getNativePtr();
        CompassDataColumnInfo columnInfo = (CompassDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.CompassData.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Float realmGet$Bx = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Bx();
        if (realmGet$Bx != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.BxColKey, objKey, realmGet$Bx, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.BxColKey, objKey, false);
        }
        Float realmGet$By = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$By();
        if (realmGet$By != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.ByColKey, objKey, realmGet$By, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.ByColKey, objKey, false);
        }
        Float realmGet$Bz = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Bz();
        if (realmGet$Bz != null) {
            Table.nativeSetFloat(tableNativePtr, columnInfo.BzColKey, objKey, realmGet$Bz, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.BzColKey, objKey, false);
        }
        String realmGet$Axis = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Axis();
        if (realmGet$Axis != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.AxisColKey, objKey, realmGet$Axis, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.AxisColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$time(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$block(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.CompassData.class);
        long tableNativePtr = table.getNativePtr();
        CompassDataColumnInfo columnInfo = (CompassDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.CompassData.class);
        io.pslab.models.CompassData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.CompassData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Float realmGet$Bx = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Bx();
            if (realmGet$Bx != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.BxColKey, objKey, realmGet$Bx, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.BxColKey, objKey, false);
            }
            Float realmGet$By = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$By();
            if (realmGet$By != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.ByColKey, objKey, realmGet$By, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.ByColKey, objKey, false);
            }
            Float realmGet$Bz = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Bz();
            if (realmGet$Bz != null) {
                Table.nativeSetFloat(tableNativePtr, columnInfo.BzColKey, objKey, realmGet$Bz, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.BzColKey, objKey, false);
            }
            String realmGet$Axis = ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$Axis();
            if (realmGet$Axis != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.AxisColKey, objKey, realmGet$Axis, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.AxisColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$time(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$block(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_CompassDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static io.pslab.models.CompassData createDetachedCopy(io.pslab.models.CompassData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.pslab.models.CompassData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.pslab.models.CompassData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.pslab.models.CompassData) cachedObject.object;
            }
            unmanagedObject = (io.pslab.models.CompassData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_pslab_models_CompassDataRealmProxyInterface unmanagedCopy = (io_pslab_models_CompassDataRealmProxyInterface) unmanagedObject;
        io_pslab_models_CompassDataRealmProxyInterface realmSource = (io_pslab_models_CompassDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$Bx(realmSource.realmGet$Bx());
        unmanagedCopy.realmSet$By(realmSource.realmGet$By());
        unmanagedCopy.realmSet$Bz(realmSource.realmGet$Bz());
        unmanagedCopy.realmSet$Axis(realmSource.realmGet$Axis());
        unmanagedCopy.realmSet$time(realmSource.realmGet$time());
        unmanagedCopy.realmSet$block(realmSource.realmGet$block());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());

        return unmanagedObject;
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
        io_pslab_models_CompassDataRealmProxy aCompassData = (io_pslab_models_CompassDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aCompassData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCompassData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aCompassData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
