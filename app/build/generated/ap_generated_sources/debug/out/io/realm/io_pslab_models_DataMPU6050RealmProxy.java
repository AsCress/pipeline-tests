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
public class io_pslab_models_DataMPU6050RealmProxy extends io.pslab.models.DataMPU6050
    implements RealmObjectProxy, io_pslab_models_DataMPU6050RealmProxyInterface {

    static final class DataMPU6050ColumnInfo extends ColumnInfo {
        long trialColKey;
        long idColKey;
        long axColKey;
        long ayColKey;
        long azColKey;
        long gxColKey;
        long gyColKey;
        long gzColKey;
        long temperatureColKey;

        DataMPU6050ColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("DataMPU6050");
            this.trialColKey = addColumnDetails("trial", "trial", objectSchemaInfo);
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.axColKey = addColumnDetails("ax", "ax", objectSchemaInfo);
            this.ayColKey = addColumnDetails("ay", "ay", objectSchemaInfo);
            this.azColKey = addColumnDetails("az", "az", objectSchemaInfo);
            this.gxColKey = addColumnDetails("gx", "gx", objectSchemaInfo);
            this.gyColKey = addColumnDetails("gy", "gy", objectSchemaInfo);
            this.gzColKey = addColumnDetails("gz", "gz", objectSchemaInfo);
            this.temperatureColKey = addColumnDetails("temperature", "temperature", objectSchemaInfo);
        }

        DataMPU6050ColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new DataMPU6050ColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final DataMPU6050ColumnInfo src = (DataMPU6050ColumnInfo) rawSrc;
            final DataMPU6050ColumnInfo dst = (DataMPU6050ColumnInfo) rawDst;
            dst.trialColKey = src.trialColKey;
            dst.idColKey = src.idColKey;
            dst.axColKey = src.axColKey;
            dst.ayColKey = src.ayColKey;
            dst.azColKey = src.azColKey;
            dst.gxColKey = src.gxColKey;
            dst.gyColKey = src.gyColKey;
            dst.gzColKey = src.gzColKey;
            dst.temperatureColKey = src.temperatureColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private DataMPU6050ColumnInfo columnInfo;
    private ProxyState<io.pslab.models.DataMPU6050> proxyState;

    io_pslab_models_DataMPU6050RealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (DataMPU6050ColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.pslab.models.DataMPU6050>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$trial() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.trialColKey);
    }

    @Override
    public void realmSet$trial(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.trialColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.trialColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.idColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$ax() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.axColKey);
    }

    @Override
    public void realmSet$ax(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.axColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.axColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$ay() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.ayColKey);
    }

    @Override
    public void realmSet$ay(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.ayColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.ayColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$az() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.azColKey);
    }

    @Override
    public void realmSet$az(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.azColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.azColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$gx() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.gxColKey);
    }

    @Override
    public void realmSet$gx(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.gxColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.gxColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$gy() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.gyColKey);
    }

    @Override
    public void realmSet$gy(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.gyColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.gyColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$gz() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.gzColKey);
    }

    @Override
    public void realmSet$gz(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.gzColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.gzColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$temperature() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.temperatureColKey);
    }

    @Override
    public void realmSet$temperature(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.temperatureColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.temperatureColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "DataMPU6050", false, 9, 0);
        builder.addPersistedProperty(NO_ALIAS, "trial", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "ax", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "ay", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "az", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "gx", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "gy", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "gz", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "temperature", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DataMPU6050ColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new DataMPU6050ColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "DataMPU6050";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DataMPU6050";
    }

    @SuppressWarnings("cast")
    public static io.pslab.models.DataMPU6050 createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.pslab.models.DataMPU6050 obj = realm.createObjectInternal(io.pslab.models.DataMPU6050.class, true, excludeFields);

        final io_pslab_models_DataMPU6050RealmProxyInterface objProxy = (io_pslab_models_DataMPU6050RealmProxyInterface) obj;
        if (json.has("trial")) {
            if (json.isNull("trial")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'trial' to null.");
            } else {
                objProxy.realmSet$trial((long) json.getLong("trial"));
            }
        }
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                objProxy.realmSet$id((long) json.getLong("id"));
            }
        }
        if (json.has("ax")) {
            if (json.isNull("ax")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ax' to null.");
            } else {
                objProxy.realmSet$ax((double) json.getDouble("ax"));
            }
        }
        if (json.has("ay")) {
            if (json.isNull("ay")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'ay' to null.");
            } else {
                objProxy.realmSet$ay((double) json.getDouble("ay"));
            }
        }
        if (json.has("az")) {
            if (json.isNull("az")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'az' to null.");
            } else {
                objProxy.realmSet$az((double) json.getDouble("az"));
            }
        }
        if (json.has("gx")) {
            if (json.isNull("gx")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'gx' to null.");
            } else {
                objProxy.realmSet$gx((double) json.getDouble("gx"));
            }
        }
        if (json.has("gy")) {
            if (json.isNull("gy")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'gy' to null.");
            } else {
                objProxy.realmSet$gy((double) json.getDouble("gy"));
            }
        }
        if (json.has("gz")) {
            if (json.isNull("gz")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'gz' to null.");
            } else {
                objProxy.realmSet$gz((double) json.getDouble("gz"));
            }
        }
        if (json.has("temperature")) {
            if (json.isNull("temperature")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'temperature' to null.");
            } else {
                objProxy.realmSet$temperature((double) json.getDouble("temperature"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static io.pslab.models.DataMPU6050 createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final io.pslab.models.DataMPU6050 obj = new io.pslab.models.DataMPU6050();
        final io_pslab_models_DataMPU6050RealmProxyInterface objProxy = (io_pslab_models_DataMPU6050RealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("trial")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$trial((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'trial' to null.");
                }
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (name.equals("ax")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ax((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ax' to null.");
                }
            } else if (name.equals("ay")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$ay((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'ay' to null.");
                }
            } else if (name.equals("az")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$az((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'az' to null.");
                }
            } else if (name.equals("gx")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$gx((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'gx' to null.");
                }
            } else if (name.equals("gy")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$gy((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'gy' to null.");
                }
            } else if (name.equals("gz")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$gz((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'gz' to null.");
                }
            } else if (name.equals("temperature")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$temperature((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'temperature' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static io_pslab_models_DataMPU6050RealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(io.pslab.models.DataMPU6050.class), false, Collections.<String>emptyList());
        io.realm.io_pslab_models_DataMPU6050RealmProxy obj = new io.realm.io_pslab_models_DataMPU6050RealmProxy();
        objectContext.clear();
        return obj;
    }

    public static io.pslab.models.DataMPU6050 copyOrUpdate(Realm realm, DataMPU6050ColumnInfo columnInfo, io.pslab.models.DataMPU6050 object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (io.pslab.models.DataMPU6050) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static io.pslab.models.DataMPU6050 copy(Realm realm, DataMPU6050ColumnInfo columnInfo, io.pslab.models.DataMPU6050 newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.pslab.models.DataMPU6050) cachedRealmObject;
        }

        io_pslab_models_DataMPU6050RealmProxyInterface unmanagedSource = (io_pslab_models_DataMPU6050RealmProxyInterface) newObject;

        Table table = realm.getTable(io.pslab.models.DataMPU6050.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.trialColKey, unmanagedSource.realmGet$trial());
        builder.addInteger(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addDouble(columnInfo.axColKey, unmanagedSource.realmGet$ax());
        builder.addDouble(columnInfo.ayColKey, unmanagedSource.realmGet$ay());
        builder.addDouble(columnInfo.azColKey, unmanagedSource.realmGet$az());
        builder.addDouble(columnInfo.gxColKey, unmanagedSource.realmGet$gx());
        builder.addDouble(columnInfo.gyColKey, unmanagedSource.realmGet$gy());
        builder.addDouble(columnInfo.gzColKey, unmanagedSource.realmGet$gz());
        builder.addDouble(columnInfo.temperatureColKey, unmanagedSource.realmGet$temperature());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.io_pslab_models_DataMPU6050RealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, io.pslab.models.DataMPU6050 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.DataMPU6050.class);
        long tableNativePtr = table.getNativePtr();
        DataMPU6050ColumnInfo columnInfo = (DataMPU6050ColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.DataMPU6050.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.trialColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$trial(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$id(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.axColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$ax(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.ayColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$ay(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.azColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$az(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.gxColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gx(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.gyColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gy(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.gzColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gz(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.temperatureColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$temperature(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.DataMPU6050.class);
        long tableNativePtr = table.getNativePtr();
        DataMPU6050ColumnInfo columnInfo = (DataMPU6050ColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.DataMPU6050.class);
        io.pslab.models.DataMPU6050 object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.DataMPU6050) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.trialColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$trial(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$id(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.axColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$ax(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.ayColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$ay(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.azColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$az(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.gxColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gx(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.gyColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gy(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.gzColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gz(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.temperatureColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$temperature(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, io.pslab.models.DataMPU6050 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.DataMPU6050.class);
        long tableNativePtr = table.getNativePtr();
        DataMPU6050ColumnInfo columnInfo = (DataMPU6050ColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.DataMPU6050.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.trialColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$trial(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$id(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.axColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$ax(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.ayColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$ay(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.azColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$az(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.gxColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gx(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.gyColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gy(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.gzColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gz(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.temperatureColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$temperature(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.DataMPU6050.class);
        long tableNativePtr = table.getNativePtr();
        DataMPU6050ColumnInfo columnInfo = (DataMPU6050ColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.DataMPU6050.class);
        io.pslab.models.DataMPU6050 object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.DataMPU6050) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.trialColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$trial(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.idColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$id(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.axColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$ax(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.ayColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$ay(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.azColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$az(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.gxColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gx(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.gyColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gy(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.gzColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$gz(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.temperatureColKey, objKey, ((io_pslab_models_DataMPU6050RealmProxyInterface) object).realmGet$temperature(), false);
        }
    }

    public static io.pslab.models.DataMPU6050 createDetachedCopy(io.pslab.models.DataMPU6050 realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.pslab.models.DataMPU6050 unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.pslab.models.DataMPU6050();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.pslab.models.DataMPU6050) cachedObject.object;
            }
            unmanagedObject = (io.pslab.models.DataMPU6050) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_pslab_models_DataMPU6050RealmProxyInterface unmanagedCopy = (io_pslab_models_DataMPU6050RealmProxyInterface) unmanagedObject;
        io_pslab_models_DataMPU6050RealmProxyInterface realmSource = (io_pslab_models_DataMPU6050RealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$trial(realmSource.realmGet$trial());
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$ax(realmSource.realmGet$ax());
        unmanagedCopy.realmSet$ay(realmSource.realmGet$ay());
        unmanagedCopy.realmSet$az(realmSource.realmGet$az());
        unmanagedCopy.realmSet$gx(realmSource.realmGet$gx());
        unmanagedCopy.realmSet$gy(realmSource.realmGet$gy());
        unmanagedCopy.realmSet$gz(realmSource.realmGet$gz());
        unmanagedCopy.realmSet$temperature(realmSource.realmGet$temperature());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("DataMPU6050 = proxy[");
        stringBuilder.append("{trial:");
        stringBuilder.append(realmGet$trial());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ax:");
        stringBuilder.append(realmGet$ax());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{ay:");
        stringBuilder.append(realmGet$ay());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{az:");
        stringBuilder.append(realmGet$az());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{gx:");
        stringBuilder.append(realmGet$gx());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{gy:");
        stringBuilder.append(realmGet$gy());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{gz:");
        stringBuilder.append(realmGet$gz());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{temperature:");
        stringBuilder.append(realmGet$temperature());
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
        io_pslab_models_DataMPU6050RealmProxy aDataMPU6050 = (io_pslab_models_DataMPU6050RealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aDataMPU6050.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aDataMPU6050.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aDataMPU6050.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
