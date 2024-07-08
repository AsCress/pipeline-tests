// Generated code from Butter Knife. Do not modify!
package io.pslab.activity;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.pslab.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShowLoggedData_ViewBinding implements Unbinder {
  private ShowLoggedData target;

  @UiThread
  public ShowLoggedData_ViewBinding(ShowLoggedData target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ShowLoggedData_ViewBinding(ShowLoggedData target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.linearLayout = Utils.findRequiredViewAsType(source, R.id.layout_container, "field 'linearLayout'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ShowLoggedData target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.linearLayout = null;
  }
}
