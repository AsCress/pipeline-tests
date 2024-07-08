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
public class io_pslab_models_WaveGeneratorDataRealmProxy extends io.pslab.models.WaveGeneratorData
    implements RealmObjectProxy, io_pslab_models_WaveGeneratorDataRealmProxyInterface {

    static final class WaveGeneratorDataColumnInfo extends ColumnInfo {
        long timeColKey;
        long blockColKey;
        long modeColKey;
        long waveColKey;
        long shapeColKey;
        long freqColKey;
        long phaseColKey;
        long dutyColKey;
        long latColKey;
        long lonColKey;

        WaveGeneratorDataColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("WaveGeneratorData");
            this.timeColKey = addColumnDetails("time", "time", objectSchemaInfo);
            this.blockColKey = addColumnDetails("block", "block", objectSchemaInfo);
            this.modeColKey = addColumnDetails("mode", "mode", objectSchemaInfo);
            this.waveColKey = addColumnDetails("wave", "wave", objectSchemaInfo);
            this.shapeColKey = addColumnDetails("shape", "shape", objectSchemaInfo);
            this.freqColKey = addColumnDetails("freq", "freq", objectSchemaInfo);
            this.phaseColKey = addColumnDetails("phase", "phase", objectSchemaInfo);
            this.dutyColKey = addColumnDetails("duty", "duty", objectSchemaInfo);
            this.latColKey = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lonColKey = addColumnDetails("lon", "lon", objectSchemaInfo);
        }

        WaveGeneratorDataColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new WaveGeneratorDataColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final WaveGeneratorDataColumnInfo src = (WaveGeneratorDataColumnInfo) rawSrc;
            final WaveGeneratorDataColumnInfo dst = (WaveGeneratorDataColumnInfo) rawDst;
            dst.timeColKey = src.timeColKey;
            dst.blockColKey = src.blockColKey;
            dst.modeColKey = src.modeColKey;
            dst.waveColKey = src.waveColKey;
            dst.shapeColKey = src.shapeColKey;
            dst.freqColKey = src.freqColKey;
            dst.phaseColKey = src.phaseColKey;
            dst.dutyColKey = src.dutyColKey;
            dst.latColKey = src.latColKey;
            dst.lonColKey = src.lonColKey;
        }
    }

    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private WaveGeneratorDataColumnInfo columnInfo;
    private ProxyState<io.pslab.models.WaveGeneratorData> proxyState;

    io_pslab_models_WaveGeneratorDataRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (WaveGeneratorDataColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<io.pslab.models.WaveGeneratorData>(this);
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
    public String realmGet$mode() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.modeColKey);
    }

    @Override
    public void realmSet$mode(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.modeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.modeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.modeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.modeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$wave() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.waveColKey);
    }

    @Override
    public void realmSet$wave(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.waveColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.waveColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.waveColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.waveColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$shape() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.shapeColKey);
    }

    @Override
    public void realmSet$shape(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.shapeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.shapeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.shapeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.shapeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$freq() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.freqColKey);
    }

    @Override
    public void realmSet$freq(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.freqColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.freqColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.freqColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.freqColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$phase() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phaseColKey);
    }

    @Override
    public void realmSet$phase(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phaseColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.phaseColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phaseColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phaseColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$duty() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dutyColKey);
    }

    @Override
    public void realmSet$duty(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dutyColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.dutyColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dutyColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dutyColKey, value);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(NO_ALIAS, "WaveGeneratorData", false, 10, 0);
        builder.addPersistedProperty(NO_ALIAS, "time", RealmFieldType.INTEGER, Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "block", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "mode", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "wave", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "shape", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "freq", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "phase", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "duty", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty(NO_ALIAS, "lon", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static WaveGeneratorDataColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new WaveGeneratorDataColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "WaveGeneratorData";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "WaveGeneratorData";
    }

    @SuppressWarnings("cast")
    public static io.pslab.models.WaveGeneratorData createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        io.pslab.models.WaveGeneratorData obj = null;
        if (update) {
            Table table = realm.getTable(io.pslab.models.WaveGeneratorData.class);
            WaveGeneratorDataColumnInfo columnInfo = (WaveGeneratorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.WaveGeneratorData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = Table.NO_MATCH;
            if (!json.isNull("time")) {
                objKey = table.findFirstLong(pkColumnKey, json.getLong("time"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(io.pslab.models.WaveGeneratorData.class), false, Collections.<String> emptyList());
                    obj = new io.realm.io_pslab_models_WaveGeneratorDataRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("time")) {
                if (json.isNull("time")) {
                    obj = (io.realm.io_pslab_models_WaveGeneratorDataRealmProxy) realm.createObjectInternal(io.pslab.models.WaveGeneratorData.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.io_pslab_models_WaveGeneratorDataRealmProxy) realm.createObjectInternal(io.pslab.models.WaveGeneratorData.class, json.getLong("time"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'time'.");
            }
        }

        final io_pslab_models_WaveGeneratorDataRealmProxyInterface objProxy = (io_pslab_models_WaveGeneratorDataRealmProxyInterface) obj;
        if (json.has("block")) {
            if (json.isNull("block")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'block' to null.");
            } else {
                objProxy.realmSet$block((long) json.getLong("block"));
            }
        }
        if (json.has("mode")) {
            if (json.isNull("mode")) {
                objProxy.realmSet$mode(null);
            } else {
                objProxy.realmSet$mode((String) json.getString("mode"));
            }
        }
        if (json.has("wave")) {
            if (json.isNull("wave")) {
                objProxy.realmSet$wave(null);
            } else {
                objProxy.realmSet$wave((String) json.getString("wave"));
            }
        }
        if (json.has("shape")) {
            if (json.isNull("shape")) {
                objProxy.realmSet$shape(null);
            } else {
                objProxy.realmSet$shape((String) json.getString("shape"));
            }
        }
        if (json.has("freq")) {
            if (json.isNull("freq")) {
                objProxy.realmSet$freq(null);
            } else {
                objProxy.realmSet$freq((String) json.getString("freq"));
            }
        }
        if (json.has("phase")) {
            if (json.isNull("phase")) {
                objProxy.realmSet$phase(null);
            } else {
                objProxy.realmSet$phase((String) json.getString("phase"));
            }
        }
        if (json.has("duty")) {
            if (json.isNull("duty")) {
                objProxy.realmSet$duty(null);
            } else {
                objProxy.realmSet$duty((String) json.getString("duty"));
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
    public static io.pslab.models.WaveGeneratorData createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final io.pslab.models.WaveGeneratorData obj = new io.pslab.models.WaveGeneratorData();
        final io_pslab_models_WaveGeneratorDataRealmProxyInterface objProxy = (io_pslab_models_WaveGeneratorDataRealmProxyInterface) obj;
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
            } else if (name.equals("mode")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mode((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$mode(null);
                }
            } else if (name.equals("wave")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$wave((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$wave(null);
                }
            } else if (name.equals("shape")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$shape((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$shape(null);
                }
            } else if (name.equals("freq")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$freq((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$freq(null);
                }
            } else if (name.equals("phase")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phase((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phase(null);
                }
            } else if (name.equals("duty")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$duty((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$duty(null);
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

    static io_pslab_models_WaveGeneratorDataRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(io.pslab.models.WaveGeneratorData.class), false, Collections.<String>emptyList());
        io.realm.io_pslab_models_WaveGeneratorDataRealmProxy obj = new io.realm.io_pslab_models_WaveGeneratorDataRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static io.pslab.models.WaveGeneratorData copyOrUpdate(Realm realm, WaveGeneratorDataColumnInfo columnInfo, io.pslab.models.WaveGeneratorData object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (io.pslab.models.WaveGeneratorData) cachedRealmObject;
        }

        io.pslab.models.WaveGeneratorData realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(io.pslab.models.WaveGeneratorData.class);
            long pkColumnKey = columnInfo.timeColKey;
            long objKey = table.findFirstLong(pkColumnKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time());
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.io_pslab_models_WaveGeneratorDataRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static io.pslab.models.WaveGeneratorData copy(Realm realm, WaveGeneratorDataColumnInfo columnInfo, io.pslab.models.WaveGeneratorData newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (io.pslab.models.WaveGeneratorData) cachedRealmObject;
        }

        io_pslab_models_WaveGeneratorDataRealmProxyInterface unmanagedSource = (io_pslab_models_WaveGeneratorDataRealmProxyInterface) newObject;

        Table table = realm.getTable(io.pslab.models.WaveGeneratorData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.timeColKey, unmanagedSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, unmanagedSource.realmGet$block());
        builder.addString(columnInfo.modeColKey, unmanagedSource.realmGet$mode());
        builder.addString(columnInfo.waveColKey, unmanagedSource.realmGet$wave());
        builder.addString(columnInfo.shapeColKey, unmanagedSource.realmGet$shape());
        builder.addString(columnInfo.freqColKey, unmanagedSource.realmGet$freq());
        builder.addString(columnInfo.phaseColKey, unmanagedSource.realmGet$phase());
        builder.addString(columnInfo.dutyColKey, unmanagedSource.realmGet$duty());
        builder.addDouble(columnInfo.latColKey, unmanagedSource.realmGet$lat());
        builder.addDouble(columnInfo.lonColKey, unmanagedSource.realmGet$lon());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.io_pslab_models_WaveGeneratorDataRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, io.pslab.models.WaveGeneratorData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.WaveGeneratorData.class);
        long tableNativePtr = table.getNativePtr();
        WaveGeneratorDataColumnInfo columnInfo = (WaveGeneratorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.WaveGeneratorData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$block(), false);
        String realmGet$mode = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$mode();
        if (realmGet$mode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.modeColKey, objKey, realmGet$mode, false);
        }
        String realmGet$wave = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$wave();
        if (realmGet$wave != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.waveColKey, objKey, realmGet$wave, false);
        }
        String realmGet$shape = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$shape();
        if (realmGet$shape != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.shapeColKey, objKey, realmGet$shape, false);
        }
        String realmGet$freq = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$freq();
        if (realmGet$freq != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.freqColKey, objKey, realmGet$freq, false);
        }
        String realmGet$phase = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$phase();
        if (realmGet$phase != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseColKey, objKey, realmGet$phase, false);
        }
        String realmGet$duty = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$duty();
        if (realmGet$duty != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dutyColKey, objKey, realmGet$duty, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.WaveGeneratorData.class);
        long tableNativePtr = table.getNativePtr();
        WaveGeneratorDataColumnInfo columnInfo = (WaveGeneratorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.WaveGeneratorData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.WaveGeneratorData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.WaveGeneratorData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$block(), false);
            String realmGet$mode = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$mode();
            if (realmGet$mode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.modeColKey, objKey, realmGet$mode, false);
            }
            String realmGet$wave = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$wave();
            if (realmGet$wave != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.waveColKey, objKey, realmGet$wave, false);
            }
            String realmGet$shape = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$shape();
            if (realmGet$shape != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.shapeColKey, objKey, realmGet$shape, false);
            }
            String realmGet$freq = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$freq();
            if (realmGet$freq != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.freqColKey, objKey, realmGet$freq, false);
            }
            String realmGet$phase = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$phase();
            if (realmGet$phase != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phaseColKey, objKey, realmGet$phase, false);
            }
            String realmGet$duty = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$duty();
            if (realmGet$duty != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dutyColKey, objKey, realmGet$duty, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, io.pslab.models.WaveGeneratorData object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(io.pslab.models.WaveGeneratorData.class);
        long tableNativePtr = table.getNativePtr();
        WaveGeneratorDataColumnInfo columnInfo = (WaveGeneratorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.WaveGeneratorData.class);
        long pkColumnKey = columnInfo.timeColKey;
        long objKey = Table.NO_MATCH;
        Object primaryKeyValue = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time();
        if (primaryKeyValue != null) {
            objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time());
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time());
        }
        cache.put(object, objKey);
        Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$block(), false);
        String realmGet$mode = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$mode();
        if (realmGet$mode != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.modeColKey, objKey, realmGet$mode, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.modeColKey, objKey, false);
        }
        String realmGet$wave = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$wave();
        if (realmGet$wave != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.waveColKey, objKey, realmGet$wave, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.waveColKey, objKey, false);
        }
        String realmGet$shape = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$shape();
        if (realmGet$shape != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.shapeColKey, objKey, realmGet$shape, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.shapeColKey, objKey, false);
        }
        String realmGet$freq = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$freq();
        if (realmGet$freq != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.freqColKey, objKey, realmGet$freq, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.freqColKey, objKey, false);
        }
        String realmGet$phase = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$phase();
        if (realmGet$phase != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phaseColKey, objKey, realmGet$phase, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phaseColKey, objKey, false);
        }
        String realmGet$duty = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$duty();
        if (realmGet$duty != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dutyColKey, objKey, realmGet$duty, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dutyColKey, objKey, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$lon(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(io.pslab.models.WaveGeneratorData.class);
        long tableNativePtr = table.getNativePtr();
        WaveGeneratorDataColumnInfo columnInfo = (WaveGeneratorDataColumnInfo) realm.getSchema().getColumnInfo(io.pslab.models.WaveGeneratorData.class);
        long pkColumnKey = columnInfo.timeColKey;
        io.pslab.models.WaveGeneratorData object = null;
        while (objects.hasNext()) {
            object = (io.pslab.models.WaveGeneratorData) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = Table.NO_MATCH;
            Object primaryKeyValue = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time();
            if (primaryKeyValue != null) {
                objKey = Table.nativeFindFirstInt(tableNativePtr, pkColumnKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time());
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$time());
            }
            cache.put(object, objKey);
            Table.nativeSetLong(tableNativePtr, columnInfo.blockColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$block(), false);
            String realmGet$mode = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$mode();
            if (realmGet$mode != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.modeColKey, objKey, realmGet$mode, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.modeColKey, objKey, false);
            }
            String realmGet$wave = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$wave();
            if (realmGet$wave != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.waveColKey, objKey, realmGet$wave, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.waveColKey, objKey, false);
            }
            String realmGet$shape = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$shape();
            if (realmGet$shape != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.shapeColKey, objKey, realmGet$shape, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.shapeColKey, objKey, false);
            }
            String realmGet$freq = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$freq();
            if (realmGet$freq != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.freqColKey, objKey, realmGet$freq, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.freqColKey, objKey, false);
            }
            String realmGet$phase = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$phase();
            if (realmGet$phase != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phaseColKey, objKey, realmGet$phase, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phaseColKey, objKey, false);
            }
            String realmGet$duty = ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$duty();
            if (realmGet$duty != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dutyColKey, objKey, realmGet$duty, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dutyColKey, objKey, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lonColKey, objKey, ((io_pslab_models_WaveGeneratorDataRealmProxyInterface) object).realmGet$lon(), false);
        }
    }

    public static io.pslab.models.WaveGeneratorData createDetachedCopy(io.pslab.models.WaveGeneratorData realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        io.pslab.models.WaveGeneratorData unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new io.pslab.models.WaveGeneratorData();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (io.pslab.models.WaveGeneratorData) cachedObject.object;
            }
            unmanagedObject = (io.pslab.models.WaveGeneratorData) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        io_pslab_models_WaveGeneratorDataRealmProxyInterface unmanagedCopy = (io_pslab_models_WaveGeneratorDataRealmProxyInterface) unmanagedObject;
        io_pslab_models_WaveGeneratorDataRealmProxyInterface realmSource = (io_pslab_models_WaveGeneratorDataRealmProxyInterface) realmObject;
        Realm objectRealm = (Realm) ((RealmObjectProxy) realmObject).realmGet$proxyState().getRealm$realm();
        unmanagedCopy.realmSet$time(realmSource.realmGet$time());
        unmanagedCopy.realmSet$block(realmSource.realmGet$block());
        unmanagedCopy.realmSet$mode(realmSource.realmGet$mode());
        unmanagedCopy.realmSet$wave(realmSource.realmGet$wave());
        unmanagedCopy.realmSet$shape(realmSource.realmGet$shape());
        unmanagedCopy.realmSet$freq(realmSource.realmGet$freq());
        unmanagedCopy.realmSet$phase(realmSource.realmGet$phase());
        unmanagedCopy.realmSet$duty(realmSource.realmGet$duty());
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lon(realmSource.realmGet$lon());

        return unmanagedObject;
    }

    static io.pslab.models.WaveGeneratorData update(Realm realm, WaveGeneratorDataColumnInfo columnInfo, io.pslab.models.WaveGeneratorData realmObject, io.pslab.models.WaveGeneratorData newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        io_pslab_models_WaveGeneratorDataRealmProxyInterface realmObjectTarget = (io_pslab_models_WaveGeneratorDataRealmProxyInterface) realmObject;
        io_pslab_models_WaveGeneratorDataRealmProxyInterface realmObjectSource = (io_pslab_models_WaveGeneratorDataRealmProxyInterface) newObject;
        Table table = realm.getTable(io.pslab.models.WaveGeneratorData.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addInteger(columnInfo.timeColKey, realmObjectSource.realmGet$time());
        builder.addInteger(columnInfo.blockColKey, realmObjectSource.realmGet$block());
        builder.addString(columnInfo.modeColKey, realmObjectSource.realmGet$mode());
        builder.addString(columnInfo.waveColKey, realmObjectSource.realmGet$wave());
        builder.addString(columnInfo.shapeColKey, realmObjectSource.realmGet$shape());
        builder.addString(columnInfo.freqColKey, realmObjectSource.realmGet$freq());
        builder.addString(columnInfo.phaseColKey, realmObjectSource.realmGet$phase());
        builder.addString(columnInfo.dutyColKey, realmObjectSource.realmGet$duty());
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
        io_pslab_models_WaveGeneratorDataRealmProxy aWaveGeneratorData = (io_pslab_models_WaveGeneratorDataRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aWaveGeneratorData.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aWaveGeneratorData.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aWaveGeneratorData.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
