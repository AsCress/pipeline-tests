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

public class SoundMeterDataFragment_ViewBinding implements Unbinder {
  private SoundMeterDataFragment target;

  @UiThread
  public SoundMeterDataFragment_ViewBinding(SoundMeterDataFragment target, View source) {
    this.target = target;

    target.statMax = Utils.findRequiredViewAsType(source, R.id.sound_max, "field 'statMax'", TextView.class);
    target.statMin = Utils.findRequiredViewAsType(source, R.id.sound_min, "field 'statMin'", TextView.class);
    target.statMean = Utils.findRequiredViewAsType(source, R.id.sound_avg, "field 'statMean'", TextView.class);
    target.sensorLabel = Utils.findRequiredViewAsType(source, R.id.label_sound_sensor, "field 'sensorLabel'", TextView.class);
    target.mChart = Utils.findRequiredViewAsType(source, R.id.chart_sound_meter, "field 'mChart'", LineChart.class);
    target.decibelMeter = Utils.findRequiredViewAsType(source, R.id.sound_meter, "field 'decibelMeter'", PointerSpeedometer.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SoundMeterDataFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.statMax = null;
    target.statMin = null;
    target.statMean = null;
    target.sensorLabel = null;
    target.mChart = null;
    target.decibelMeter = null;
  }
}
