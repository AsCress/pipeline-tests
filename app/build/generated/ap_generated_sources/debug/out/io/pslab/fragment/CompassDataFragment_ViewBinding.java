// Generated code from Butter Knife. Do not modify!
package io.pslab.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.pslab.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CompassDataFragment_ViewBinding implements Unbinder {
  private CompassDataFragment target;

  @UiThread
  public CompassDataFragment_ViewBinding(CompassDataFragment target, View source) {
    this.target = target;

    target.compass = Utils.findOptionalViewAsType(source, R.id.compass, "field 'compass'", ImageView.class);
    target.degreeIndicator = Utils.findRequiredViewAsType(source, R.id.degree_indicator, "field 'degreeIndicator'", TextView.class);
    target.xAxisRadioButton = Utils.findRequiredViewAsType(source, R.id.compass_radio_button_x_axis, "field 'xAxisRadioButton'", RadioButton.class);
    target.yAxisRadioButton = Utils.findRequiredViewAsType(source, R.id.compass_radio_button_y_axis, "field 'yAxisRadioButton'", RadioButton.class);
    target.zAxisRadioButton = Utils.findRequiredViewAsType(source, R.id.compass_radio_button_z_axis, "field 'zAxisRadioButton'", RadioButton.class);
    target.xAxisMagneticField = Utils.findRequiredViewAsType(source, R.id.tv_sensor_hmc5883l_bx, "field 'xAxisMagneticField'", TextView.class);
    target.yAxisMagneticField = Utils.findRequiredViewAsType(source, R.id.tv_sensor_hmc5883l_by, "field 'yAxisMagneticField'", TextView.class);
    target.zAxisMagneticField = Utils.findRequiredViewAsType(source, R.id.tv_sensor_hmc5883l_bz, "field 'zAxisMagneticField'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CompassDataFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.compass = null;
    target.degreeIndicator = null;
    target.xAxisRadioButton = null;
    target.yAxisRadioButton = null;
    target.zAxisRadioButton = null;
    target.xAxisMagneticField = null;
    target.yAxisMagneticField = null;
    target.zAxisMagneticField = null;
  }
}
