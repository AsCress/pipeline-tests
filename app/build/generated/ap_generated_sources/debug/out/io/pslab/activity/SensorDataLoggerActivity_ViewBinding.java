// Generated code from Butter Knife. Do not modify!
package io.pslab.activity;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.pslab.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SensorDataLoggerActivity_ViewBinding implements Unbinder {
  private SensorDataLoggerActivity target;

  @UiThread
  public SensorDataLoggerActivity_ViewBinding(SensorDataLoggerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SensorDataLoggerActivity_ViewBinding(SensorDataLoggerActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.scanFab = Utils.findRequiredViewAsType(source, R.id.fab, "field 'scanFab'", FloatingActionButton.class);
    target.coordinatorLayout = Utils.findRequiredViewAsType(source, R.id.coordinator_layout, "field 'coordinatorLayout'", CoordinatorLayout.class);
    target.container = Utils.findRequiredViewAsType(source, R.id.layout_container, "field 'container'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SensorDataLoggerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.scanFab = null;
    target.coordinatorLayout = null;
    target.container = null;
  }
}
