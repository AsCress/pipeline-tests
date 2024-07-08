// Generated code from Butter Knife. Do not modify!
package io.pslab.activity;

import android.view.View;
import android.widget.EditText;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.internal.Utils;
import com.sdsmdg.harjot.crollerTest.Croller;
import io.pslab.R;
import io.pslab.activity.guide.GuideActivity_ViewBinding;
import io.pslab.items.SquareImageButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PowerSourceActivity_ViewBinding extends GuideActivity_ViewBinding {
  private PowerSourceActivity target;

  @UiThread
  public PowerSourceActivity_ViewBinding(PowerSourceActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PowerSourceActivity_ViewBinding(PowerSourceActivity target, View source) {
    super(target, source);

    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.controllerPV1 = Utils.findRequiredViewAsType(source, R.id.power_card_pv1_controller, "field 'controllerPV1'", Croller.class);
    target.displayPV1 = Utils.findRequiredViewAsType(source, R.id.power_card_pv1_display, "field 'displayPV1'", EditText.class);
    target.upPV1 = Utils.findRequiredViewAsType(source, R.id.power_card_pv1_up, "field 'upPV1'", SquareImageButton.class);
    target.downPV1 = Utils.findRequiredViewAsType(source, R.id.power_card_pv1_down, "field 'downPV1'", SquareImageButton.class);
    target.coordinatorLayout = Utils.findRequiredViewAsType(source, R.id.power_source_coordinatorLayout, "field 'coordinatorLayout'", CoordinatorLayout.class);
    target.controllerPV2 = Utils.findRequiredViewAsType(source, R.id.power_card_pv2_controller, "field 'controllerPV2'", Croller.class);
    target.displayPV2 = Utils.findRequiredViewAsType(source, R.id.power_card_pv2_display, "field 'displayPV2'", EditText.class);
    target.upPV2 = Utils.findRequiredViewAsType(source, R.id.power_card_pv2_up, "field 'upPV2'", SquareImageButton.class);
    target.downPV2 = Utils.findRequiredViewAsType(source, R.id.power_card_pv2_down, "field 'downPV2'", SquareImageButton.class);
    target.controllerPV3 = Utils.findRequiredViewAsType(source, R.id.power_card_pv3_controller, "field 'controllerPV3'", Croller.class);
    target.displayPV3 = Utils.findRequiredViewAsType(source, R.id.power_card_pv3_display, "field 'displayPV3'", EditText.class);
    target.upPV3 = Utils.findRequiredViewAsType(source, R.id.power_card_pv3_up, "field 'upPV3'", SquareImageButton.class);
    target.downPV3 = Utils.findRequiredViewAsType(source, R.id.power_card_pv3_down, "field 'downPV3'", SquareImageButton.class);
    target.controllerPCS = Utils.findRequiredViewAsType(source, R.id.power_card_pcs_controller, "field 'controllerPCS'", Croller.class);
    target.displayPCS = Utils.findRequiredViewAsType(source, R.id.power_card_pcs_display, "field 'displayPCS'", EditText.class);
    target.upPCS = Utils.findRequiredViewAsType(source, R.id.power_card_pcs_up, "field 'upPCS'", SquareImageButton.class);
    target.downPCS = Utils.findRequiredViewAsType(source, R.id.power_card_pcs_down, "field 'downPCS'", SquareImageButton.class);
  }

  @Override
  public void unbind() {
    PowerSourceActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.controllerPV1 = null;
    target.displayPV1 = null;
    target.upPV1 = null;
    target.downPV1 = null;
    target.coordinatorLayout = null;
    target.controllerPV2 = null;
    target.displayPV2 = null;
    target.upPV2 = null;
    target.downPV2 = null;
    target.controllerPV3 = null;
    target.displayPV3 = null;
    target.upPV3 = null;
    target.downPV3 = null;
    target.controllerPCS = null;
    target.displayPCS = null;
    target.upPCS = null;
    target.downPCS = null;

    super.unbind();
  }
}
