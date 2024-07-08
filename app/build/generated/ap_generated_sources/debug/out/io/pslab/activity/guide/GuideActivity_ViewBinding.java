// Generated code from Butter Knife. Do not modify!
package io.pslab.activity.guide;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.pslab.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GuideActivity_ViewBinding implements Unbinder {
  private GuideActivity target;

  @UiThread
  public GuideActivity_ViewBinding(GuideActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public GuideActivity_ViewBinding(GuideActivity target, View source) {
    this.target = target;

    target.bottomSheet = Utils.findRequiredViewAsType(source, R.id.bottom_sheet, "field 'bottomSheet'", LinearLayout.class);
    target.shadowLayer = Utils.findRequiredView(source, R.id.shadow, "field 'shadowLayer'");
    target.arrowUpDown = Utils.findRequiredViewAsType(source, R.id.img_arrow, "field 'arrowUpDown'", ImageView.class);
    target.bottomSheetSlideText = Utils.findRequiredViewAsType(source, R.id.sheet_slide_text, "field 'bottomSheetSlideText'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GuideActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.bottomSheet = null;
    target.shadowLayer = null;
    target.arrowUpDown = null;
    target.bottomSheetSlideText = null;
  }
}
