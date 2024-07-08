// Generated code from Butter Knife. Do not modify!
package io.pslab.fragment;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.appbar.AppBarLayout;
import io.pslab.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HelpAndFeedbackFragment_ViewBinding implements Unbinder {
  private HelpAndFeedbackFragment target;

  @UiThread
  public HelpAndFeedbackFragment_ViewBinding(HelpAndFeedbackFragment target, View source) {
    this.target = target;

    target.appBarLayout = Utils.findRequiredViewAsType(source, R.id.appBarAnim, "field 'appBarLayout'", AppBarLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HelpAndFeedbackFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.appBarLayout = null;
  }
}
