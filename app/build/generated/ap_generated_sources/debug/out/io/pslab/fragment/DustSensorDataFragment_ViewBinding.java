// Generated code from Butter Knife. Do not modify!
package io.pslab.fragment;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.github.anastr.speedviewlib.PointerSpeedometer;
import com.github.mikephil.charting.charts.LineChart;
import io.pslab.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DustSensorDataFragment_ViewBinding implements Unbinder {
  private DustSensorDataFragment target;

  @UiThread
  public DustSensorDataFragment_ViewBinding(DustSensorDataFragment target, View source) {
    this.target = target;

    target.dustValue = Utils.findRequiredViewAsType(source, R.id.dust_sensor_value, "field 'dustValue'", TextView.class);
    target.dustStatus = Utils.findRequiredViewAsType(source, R.id.dust_sensor_status, "field 'dustStatus'", TextView.class);
    target.sensorLabel = Utils.findRequiredViewAsType(source, R.id.label_dust_sensor, "field 'sensorLabel'", TextView.class);
    target.mChart = Utils.findRequiredViewAsType(source, R.id.chart_dust_sensor, "field 'mChart'", LineChart.class);
    target.dustSensorMeter = Utils.findRequiredViewAsType(source, R.id.dust_sensor, "field 'dustSensorMeter'", PointerSpeedometer.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DustSensorDataFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.dustValue = null;
    target.dustStatus = null;
    target.sensorLabel = null;
    target.mChart = null;
    target.dustSensorMeter = null;
  }
}
