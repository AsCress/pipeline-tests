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

public class ThermometerDataFragment_ViewBinding implements Unbinder {
  private ThermometerDataFragment target;

  @UiThread
  public ThermometerDataFragment_ViewBinding(ThermometerDataFragment target, View source) {
    this.target = target;

    target.statMax = Utils.findRequiredViewAsType(source, R.id.thermo_max, "field 'statMax'", TextView.class);
    target.statMin = Utils.findRequiredViewAsType(source, R.id.thermo_min, "field 'statMin'", TextView.class);
    target.statMean = Utils.findRequiredViewAsType(source, R.id.thermo_avg, "field 'statMean'", TextView.class);
    target.sensorLabel = Utils.findRequiredViewAsType(source, R.id.label_thermo_sensor, "field 'sensorLabel'", TextView.class);
    target.mChart = Utils.findRequiredViewAsType(source, R.id.chart_thermo_meter, "field 'mChart'", LineChart.class);
    target.thermometer = Utils.findRequiredViewAsType(source, R.id.thermo_meter, "field 'thermometer'", PointerSpeedometer.class);
    target.label_statMin = Utils.findRequiredViewAsType(source, R.id.label_thermo_stat_min, "field 'label_statMin'", TextView.class);
    target.label_statAvg = Utils.findRequiredViewAsType(source, R.id.label_thermo_stat_avg, "field 'label_statAvg'", TextView.class);
    target.label_statMax = Utils.findRequiredViewAsType(source, R.id.label_thermo_stat_max, "field 'label_statMax'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ThermometerDataFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.statMax = null;
    target.statMin = null;
    target.statMean = null;
    target.sensorLabel = null;
    target.mChart = null;
    target.thermometer = null;
    target.label_statMin = null;
    target.label_statAvg = null;
    target.label_statMax = null;
  }
}
