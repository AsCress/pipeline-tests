// Generated code from Butter Knife. Do not modify!
package io.pslab.activity;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.pslab.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingsActivity_ViewBinding implements Unbinder {
  private SettingsActivity target;

  @UiThread
  public SettingsActivity_ViewBinding(SettingsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SettingsActivity_ViewBinding(SettingsActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.setting_toolbar, "field 'toolbar'", Toolbar.class);
    target.content = Utils.findRequiredViewAsType(source, R.id.content, "field 'content'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SettingsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.content = null;
  }
}
