// Generated code from Butter Knife. Do not modify!
package io.pslab.activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.internal.Utils;
import io.pslab.R;
import io.pslab.activity.guide.GuideActivity_ViewBinding;
import it.beppi.knoblibrary.Knob;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MultimeterActivity_ViewBinding extends GuideActivity_ViewBinding {
  private MultimeterActivity target;

  @UiThread
  public MultimeterActivity_ViewBinding(MultimeterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MultimeterActivity_ViewBinding(MultimeterActivity target, View source) {
    super(target, source);

    this.target = target;

    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.multimeter_toolbar, "field 'mToolbar'", Toolbar.class);
    target.quantity = Utils.findRequiredViewAsType(source, R.id.quantity, "field 'quantity'", TextView.class);
    target.unit = Utils.findRequiredViewAsType(source, R.id.unit, "field 'unit'", TextView.class);
    target.knob = Utils.findRequiredViewAsType(source, R.id.knobs, "field 'knob'", Knob.class);
    target.aSwitch = Utils.findRequiredViewAsType(source, R.id.selector, "field 'aSwitch'", SwitchCompat.class);
    target.coordinatorLayout = Utils.findRequiredViewAsType(source, R.id.multimeter_coordinator_layout, "field 'coordinatorLayout'", CoordinatorLayout.class);
  }

  @Override
  public void unbind() {
    MultimeterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mToolbar = null;
    target.quantity = null;
    target.unit = null;
    target.knob = null;
    target.aSwitch = null;
    target.coordinatorLayout = null;

    super.unbind();
  }
}
