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
public class io_pslab_models_OscilloscopeDataRealmProxy extends io.pslab.models.OscilloscopeData
    implements RealmObjectProxy, io_pslab_models_OscilloscopeDataRealmProxyInterface {

    static final class OscilloscopeDataColumnInfo extends ColumnInfo {
        long timeColKey;
        long blockColKey;
        long dataXColKey;
        long dataYColKey;
        long channelColKey;
        long latColKey;
        long lonColKey;
        long timebaseColKey;
        long modeColKey;

        OscilloscopeDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("OscilloscopeData");
            this.timeColKey = addColumnDetails("time", "time", objectSchemaInfo);
            this.blockColKey = addColumnDetails("block", "block", objectSchemaInfo);
            this.dataXColKey = addColumnDetails("dataX", "dataX", objectSchemaInfo);
            this.dataYColKey = addColumnDetails("dataY", "dataY", objectSchemaInfo);
            this.channelColKey = addColumnDetails("channel", "channel", objectSchemaInfo);
            this.latColKey = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lonColKey = addColumnDetails("lon", "lon", objectSchemaInfo);
            this.timebaseColKey = addColumnDetails("timebase", "timebase", objectSchemaInfo);
            this.modeColKey = addColumnDetails("mode", "mode", objectSchemaInfo);
        }

        OscilloscopeDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new OscilloscopeDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final OscilloscopeDataColumnInfo src = (OscilloscopeDataColumnInfo) rawSrc;
            final OscilloscopeDataColumnInfo dst = (OscilloscopeDataColumnInfo) rawDst;
            dst.timeColKey = src.timeColKey;
            dst.blockColKey = src.blockColKey;
            dst.dataXColKey = src.dataXColKey;
            dst.dataYColKey = src.dataYColKey;
            dst.channelColKey = src.channelColKey;
            dst.latColKey = src.latColKey;
            dst.lonColKey = src.lonColKey;
            dst.timebaseColKey = src.timebaseColKey;
            dst.modeColKey = src.modeColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private OscilloscopeDataColumnInfo columnInfo;
    private ProxyState<io.pslab.models.OscilloscopeData> proxyState;

    io_pslab_models_OscilloscopeDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (OscilloscopeDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.pslab.models.OscilloscopeData>(this);
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
    public double realmGet$timebase() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.timebaseColKey);
    }

    @Override
    public void realmSet$timebase(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.timebaseColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.timebaseColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$mode() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.modeColKey);
    }

    @Override
    public void realmSet$mode(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.modeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.modeColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "OscilloscopeData", false, 9, 0);
        builder.addPersistedProperty(NO_ALIAS, "time", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "block", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "dataX", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "dataY", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "channel", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "timebase", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "mode", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OscilloscopeDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new OscilloscopeDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "OscilloscopeData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "OscilloscopeData";
    }

    @SuppressWarnings("cast")
    public static io.pslab.models.OscilloscopeData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.pslab.models.OscilloscopeData obj = null;
        if (update) {
            Table table = realm.getTable(io.pslab.models.OscilloscopeData.class);
            OscilloscopeDataColumnInfo columnInfo = (OscilloscopeDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.OscilloscopeData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("time")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("time"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(io.pslab.models.OscilloscopeData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.io_pslab_models_OscilloscopeDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("time")) {
                if (json.isNull("time")) {
                    obj = (io.realm.io_pslab_models_OscilloscopeDataRealmProxy) realm.createObjectInternal(io.pslab.models.OscilloscopeData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.io_pslab_models_OscilloscopeDataRealmProxy) realm.createObjectInternal(io.pslab.models.OscilloscopeData.class, json.getLong("time"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'time'.");
            }
        }

        final io_pslab_models_OscilloscopeDataRealmProxyInterface objProxy = (io_pslab_models_OscilloscopeDataRealmProxyInterface) obj;
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
        if (json.has("timebase")) {
            if (json.isNull("timebase")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timebase' to null.");
            } else {
                objProxy.realmSet$timebase((double) json.getDouble("timebase"));
            }
        }
        if (json.has("mode")) {
            if (json.isNull("mode")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'mode' to null.");
            } else {
                objProxy.realmSet$mode((int) json.getInt("mode"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static io.pslab.models.OscilloscopeData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final io.pslab.models.OscilloscopeData obj = new io.pslab.models.OscilloscopeData();
        final io_pslab_models_OscilloscopeDataRealmProxyInterface objProxy = (io_pslab_models_OscilloscopeDataRealmProxyInterface) obj;
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
            } else if (name.equals("timebase")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timebase((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timebase' to null.");
                }
            } else if (name.equals("mode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mode((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'mode' to null.");
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

    static io_pslab_models_OscilloscopeDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(io.pslab.models.OscilloscopeData.class), false, Collections.<String>emptyList());
        io.realm.io_pslab_models_OscilloscopeDataRealmProxy obj = new io.realm.io_pslab_models_OscilloscopeDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static io.pslab.models.OscilloscopeData copyOrUpdate(Realm realm, OscilloscopeDataColumnInfo columnInfo, io.pslab.models.OscilloscopeData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (io.pslab.models.OscilloscopeData) cachedRealmObject;
        }

        io.pslab.models.OscilloscopeData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(io.pslab.models.OscilloscopeData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.io_pslab_models_OscilloscopeDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static io.pslab.models.OscilloscopeData copy(Realm realm, OscilloscopeDataColumnInfo columnInfo, io.pslab.models.OscilloscopeData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.pslab.models.OscilloscopeData) cachedRealmObject;
        }

        io_pslab_models_OscilloscopeDataRealmProxyInterface unmanagedSource = (io_pslab_models_OscilloscopeDataRealmProxyInterface) newObject;

        Table table = realm.getTable(io.pslab.models.OscilloscopeData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.timeColKey, unmanagedSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, unmanagedSource.realmGet$block());
        builder.addString(columnInfo.dataXColKey, unmanagedSource.realmGet$dataX());
        builder.addString(columnInfo.dataYColKey, unmanagedSource.realmGet$dataY());
        builder.addString(columnInfo.channelColKey, unmanagedSource.realmGet$channel());
        builder.addDouble(columnInfo.latColKey, unmanagedSource.realmGet$lat());
        builder.addDouble(columnInfo.lonColKey, unmanagedSource.realmGet$lon());
        builder.addDouble(columnInfo.timebaseColKey, unmanagedSource.realmGet$timebase());
        builder.addInteger(columnInfo.modeColKey, unmanagedSource.realmGet$mode());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.io_pslab_models_OscilloscopeDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, io.pslab.models.OscilloscopeData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.OscilloscopeData.class);
        long tableNativePtr = table.getNativePtr();
        OscilloscopeDataColumnInfo columnInfo = (OscilloscopeDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.OscilloscopeData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$block(), false);
        String realmGet$dataX = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$dataX();
        if (realmGet$dataX != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataXColKey, objKey, realmGet$dataX, false);
        }
        String realmGet$dataY = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$dataY();
        if (realmGet$dataY != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataYColKey, objKey, realmGet$dataY, false);
        }
        String realmGet$channel = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$channel();
        if (realmGet$channel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$lon(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.timebaseColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$timebase(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.modeColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$mode(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.OscilloscopeData.class);
        long tableNativePtr = table.getNativePtr();
        OscilloscopeDataColumnInfo columnInfo = (OscilloscopeDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.OscilloscopeData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.OscilloscopeData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.OscilloscopeData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$block(), false);
            String realmGet$dataX = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$dataX();
            if (realmGet$dataX != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataXColKey, objKey, realmGet$dataX, false);
            }
            String realmGet$dataY = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$dataY();
            if (realmGet$dataY != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataYColKey, objKey, realmGet$dataY, false);
            }
            String realmGet$channel = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$channel();
            if (realmGet$channel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$lon(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.timebaseColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$timebase(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.modeColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$mode(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, io.pslab.models.OscilloscopeData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.OscilloscopeData.class);
        long tableNativePtr = table.getNativePtr();
        OscilloscopeDataColumnInfo columnInfo = (OscilloscopeDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.OscilloscopeData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$block(), false);
        String realmGet$dataX = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$dataX();
        if (realmGet$dataX != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataXColKey, objKey, realmGet$dataX, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dataXColKey, objKey, false);
        }
        String realmGet$dataY = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$dataY();
        if (realmGet$dataY != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataYColKey, objKey, realmGet$dataY, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dataYColKey, objKey, false);
        }
        String realmGet$channel = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$channel();
        if (realmGet$channel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.channelColKey, objKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$lon(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.timebaseColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$timebase(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.modeColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$mode(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.OscilloscopeData.class);
        long tableNativePtr = table.getNativePtr();
        OscilloscopeDataColumnInfo columnInfo = (OscilloscopeDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.OscilloscopeData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.OscilloscopeData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.OscilloscopeData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$time());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$block(), false);
            String realmGet$dataX = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$dataX();
            if (realmGet$dataX != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataXColKey, objKey, realmGet$dataX, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dataXColKey, objKey, false);
            }
            String realmGet$dataY = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$dataY();
            if (realmGet$dataY != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataYColKey, objKey, realmGet$dataY, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dataYColKey, objKey, false);
            }
            String realmGet$channel = ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$channel();
            if (realmGet$channel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.channelColKey, objKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$lon(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.timebaseColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$timebase(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.modeColKey, objKey, ((io_pslab_models_OscilloscopeDataRealmProxyInterface) object).realmGet$mode(), false);
        }
    }

    public static io.pslab.models.OscilloscopeData createDetachedCopy(io.pslab.models.OscilloscopeData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.pslab.models.OscilloscopeData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.pslab.models.OscilloscopeData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.pslab.models.OscilloscopeData) cachedObject.object;
            }
            unmanagedObject = (io.pslab.models.OscilloscopeData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_pslab_models_OscilloscopeDataRealmProxyInterface unmanagedCopy = (io_pslab_models_OscilloscopeDataRealmProxyInterface) unmanagedObject;
        io_pslab_models_OscilloscopeDataRealmProxyInterface realmSource = (io_pslab_models_OscilloscopeDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$time(realmSource.realmGet$time());
        unmanagedCopy.realmSet$block(realmSource.realmGet$block());
        unmanagedCopy.realmSet$dataX(realmSource.realmGet$dataX());
        unmanagedCopy.realmSet$dataY(realmSource.realmGet$dataY());
        unmanagedCopy.realmSet$channel(realmSource.realmGet$channel());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());
        unmanagedCopy.realmSet$timebase(realmSource.realmGet$timebase());
        unmanagedCopy.realmSet$mode(realmSource.realmGet$mode());

        return unmanagedObject;
    }

    static io.pslab.models.OscilloscopeData update(Realm realm, OscilloscopeDataColumnInfo columnInfo, io.pslab.models.OscilloscopeData realmObject, io.pslab.models.OscilloscopeData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        io_pslab_models_OscilloscopeDataRealmProxyInterface realmObjectTarget = (io_pslab_models_OscilloscopeDataRealmProxyInterface) realmObject;
        io_pslab_models_OscilloscopeDataRealmProxyInterface realmObjectSource = (io_pslab_models_OscilloscopeDataRealmProxyInterface) newObject;
        Table table = realm.getTable(io.pslab.models.OscilloscopeData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.timeColKey, realmObjectSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, realmObjectSource.realmGet$block());
        builder.addString(columnInfo.dataXColKey, realmObjectSource.realmGet$dataX());
        builder.addString(columnInfo.dataYColKey, realmObjectSource.realmGet$dataY());
        builder.addString(columnInfo.channelColKey, realmObjectSource.realmGet$channel());
        builder.addDouble(columnInfo.latColKey, realmObjectSource.realmGet$lat());
        builder.addDouble(columnInfo.lonColKey, realmObjectSource.realmGet$lon());
        builder.addDouble(columnInfo.timebaseColKey, realmObjectSource.realmGet$timebase());
        builder.addInteger(columnInfo.modeColKey, realmObjectSource.realmGet$mode());

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
        io_pslab_models_OscilloscopeDataRealmProxy aOscilloscopeData = (io_pslab_models_OscilloscopeDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aOscilloscopeData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aOscilloscopeData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aOscilloscopeData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
