// Generated code from Butter Knife. Do not modify!
package io.pslab.activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import io.pslab.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DataLoggerActivity_ViewBinding implements Unbinder {
  private DataLoggerActivity target;

  @UiThread
  public DataLoggerActivity_ViewBinding(DataLoggerActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DataLoggerActivity_ViewBinding(DataLoggerActivity target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
    target.blankView = Utils.findRequiredViewAsType(source, R.id.data_logger_blank_view, "field 'blankView'", TextView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DataLoggerActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.blankView = null;
    target.toolbar = null;
  }
}
