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

public class GasSensorDataFragment_ViewBinding implements Unbinder {
  private GasSensorDataFragment target;

  @UiThread
  public GasSensorDataFragment_ViewBinding(GasSensorDataFragment target, View source) {
    this.target = target;

    target.gasValue = Utils.findRequiredViewAsType(source, R.id.gas_sensor_value, "field 'gasValue'", TextView.class);
    target.sensorLabel = Utils.findRequiredViewAsType(source, R.id.label_gas_sensor, "field 'sensorLabel'", TextView.class);
    target.mChart = Utils.findRequiredViewAsType(source, R.id.chart_gas_sensor, "field 'mChart'", LineChart.class);
    target.gasSensorMeter = Utils.findRequiredViewAsType(source, R.id.gas_sensor, "field 'gasSensorMeter'", PointerSpeedometer.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GasSensorDataFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.gasValue = null;
    target.sensorLabel = null;
    target.mChart = null;
    target.gasSensorMeter = null;
  }
}
