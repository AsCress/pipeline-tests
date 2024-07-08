// Generated code from Butter Knife. Do not modify!
package io.pslab.models;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.internal.Utils;
import io.pslab.R;
import io.pslab.activity.guide.GuideActivity_ViewBinding;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PSLabSensor_ViewBinding extends GuideActivity_ViewBinding {
  private PSLabSensor target;

  @UiThread
  public PSLabSensor_ViewBinding(PSLabSensor target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PSLabSensor_ViewBinding(PSLabSensor target, View source) {
    super(target, source);

    this.target = target;

    target.sensorToolBar = Utils.findRequiredViewAsType(source, R.id.sensor_toolbar, "field 'sensorToolBar'", Toolbar.class);
    target.coordinatorLayout = Utils.findRequiredViewAsType(source, R.id.sensor_cl, "field 'coordinatorLayout'", CoordinatorLayout.class);
    target.bottomSheetGuideTitle = Utils.findRequiredViewAsType(source, R.id.guide_title, "field 'bottomSheetGuideTitle'", TextView.class);
    target.bottomSheetText = Utils.findRequiredViewAsType(source, R.id.custom_dialog_text, "field 'bottomSheetText'", TextView.class);
    target.bottomSheetSchematic = Utils.findRequiredViewAsType(source, R.id.custom_dialog_schematic, "field 'bottomSheetSchematic'", ImageView.class);
    target.bottomSheetDesc = Utils.findRequiredViewAsType(source, R.id.custom_dialog_desc, "field 'bottomSheetDesc'", TextView.class);
    target.bottomSheetAdditionalContent = Utils.findRequiredViewAsType(source, R.id.custom_dialog_additional_content, "field 'bottomSheetAdditionalContent'", LinearLayout.class);
  }

  @Override
  public void unbind() {
    PSLabSensor target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.sensorToolBar = null;
    target.coordinatorLayout = null;
    target.bottomSheetGuideTitle = null;
    target.bottomSheetText = null;
    target.bottomSheetSchematic = null;
    target.bottomSheetDesc = null;
    target.bottomSheetAdditionalContent = null;

    super.unbind();
  }
}
