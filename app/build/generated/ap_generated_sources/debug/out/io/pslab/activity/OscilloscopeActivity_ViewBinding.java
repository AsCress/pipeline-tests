// Generated code from Butter Knife. Do not modify!
package io.pslab.activity;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.Utils;
import com.github.mikephil.charting.charts.LineChart;
import io.pslab.R;
import io.pslab.activity.guide.GuideActivity_ViewBinding;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OscilloscopeActivity_ViewBinding extends GuideActivity_ViewBinding {
  private OscilloscopeActivity target;

  @UiThread
  public OscilloscopeActivity_ViewBinding(OscilloscopeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public OscilloscopeActivity_ViewBinding(OscilloscopeActivity target, View source) {
    super(target, source);

    this.target = target;

    target.mChart = Utils.findRequiredViewAsType(source, R.id.chart_os, "field 'mChart'", LineChart.class);
    target.leftYAxisLabel = Utils.findRequiredViewAsType(source, R.id.tv_label_left_yaxis_os, "field 'leftYAxisLabel'", TextView.class);
    target.leftYAxisLabelUnit = Utils.findRequiredViewAsType(source, R.id.tv_unit_left_yaxis_os, "field 'leftYAxisLabelUnit'", TextView.class);
    target.rightYAxisLabel = Utils.findRequiredViewAsType(source, R.id.tv_label_right_yaxis_os, "field 'rightYAxisLabel'", TextView.class);
    target.rightYAxisLabelUnit = Utils.findRequiredViewAsType(source, R.id.tv_unit_right_yaxis_os, "field 'rightYAxisLabelUnit'", TextView.class);
    target.xAxisLabel = Utils.findRequiredViewAsType(source, R.id.tv_graph_label_xaxis_os, "field 'xAxisLabel'", TextView.class);
    target.xAxisLabelUnit = Utils.findRequiredViewAsType(source, R.id.tv_unit_xaxis_os, "field 'xAxisLabelUnit'", TextView.class);
    target.linearLayout = Utils.findRequiredViewAsType(source, R.id.layout_dock_os1, "field 'linearLayout'", LinearLayout.class);
    target.frameLayout = Utils.findRequiredViewAsType(source, R.id.layout_dock_os2, "field 'frameLayout'", FrameLayout.class);
    target.mChartLayout = Utils.findRequiredViewAsType(source, R.id.layout_chart_os, "field 'mChartLayout'", RelativeLayout.class);
    target.channelParametersButton = Utils.findRequiredViewAsType(source, R.id.button_channel_parameters_os, "field 'channelParametersButton'", ImageButton.class);
    target.timebaseButton = Utils.findRequiredViewAsType(source, R.id.button_timebase_os, "field 'timebaseButton'", ImageButton.class);
    target.dataAnalysisButton = Utils.findRequiredViewAsType(source, R.id.button_data_analysis_os, "field 'dataAnalysisButton'", ImageButton.class);
    target.xyPlotButton = Utils.findRequiredViewAsType(source, R.id.button_xy_plot_os, "field 'xyPlotButton'", ImageButton.class);
    target.channelParametersTextView = Utils.findRequiredViewAsType(source, R.id.tv_channel_parameters_os, "field 'channelParametersTextView'", TextView.class);
    target.timebaseTiggerTextView = Utils.findRequiredViewAsType(source, R.id.tv_timebase_tigger_os, "field 'timebaseTiggerTextView'", TextView.class);
    target.dataAnalysisTextView = Utils.findRequiredViewAsType(source, R.id.tv_data_analysis_os, "field 'dataAnalysisTextView'", TextView.class);
    target.xyPlotTextView = Utils.findRequiredViewAsType(source, R.id.tv_xy_plot_os, "field 'xyPlotTextView'", TextView.class);
    target.parentLayout = Utils.findRequiredView(source, R.id.parent_layout, "field 'parentLayout'");
    target.measurementsList = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'measurementsList'", RecyclerView.class);
  }

  @Override
  public void unbind() {
    OscilloscopeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mChart = null;
    target.leftYAxisLabel = null;
    target.leftYAxisLabelUnit = null;
    target.rightYAxisLabel = null;
    target.rightYAxisLabelUnit = null;
    target.xAxisLabel = null;
    target.xAxisLabelUnit = null;
    target.linearLayout = null;
    target.frameLayout = null;
    target.mChartLayout = null;
    target.channelParametersButton = null;
    target.timebaseButton = null;
    target.dataAnalysisButton = null;
    target.xyPlotButton = null;
    target.channelParametersTextView = null;
    target.timebaseTiggerTextView = null;
    target.dataAnalysisTextView = null;
    target.xyPlotTextView = null;
    target.parentLayout = null;
    target.measurementsList = null;

    super.unbind();
  }
}
