// Generated code from Butter Knife. Do not modify!
package io.pslab.activity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.Utils;
import com.warkiz.widget.IndicatorSeekBar;
import io.pslab.R;
import io.pslab.activity.guide.GuideActivity_ViewBinding;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WaveGeneratorActivity_ViewBinding extends GuideActivity_ViewBinding {
  private WaveGeneratorActivity target;

  @UiThread
  public WaveGeneratorActivity_ViewBinding(WaveGeneratorActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WaveGeneratorActivity_ViewBinding(WaveGeneratorActivity target, View source) {
    super(target, source);

    this.target = target;

    target.selectedWaveImg = Utils.findRequiredViewAsType(source, R.id.wave_ic_img, "field 'selectedWaveImg'", ImageView.class);
    target.selectedWaveText = Utils.findRequiredViewAsType(source, R.id.wave_mon_select_wave, "field 'selectedWaveText'", TextView.class);
    target.waveFreqValue = Utils.findRequiredViewAsType(source, R.id.wave_freq_value, "field 'waveFreqValue'", TextView.class);
    target.wavePhaseValue = Utils.findRequiredViewAsType(source, R.id.wave_phase_value, "field 'wavePhaseValue'", TextView.class);
    target.waveMonPropSelect = Utils.findRequiredViewAsType(source, R.id.wave_mon_select_prop, "field 'waveMonPropSelect'", TextView.class);
    target.waveMonPropValueSelect = Utils.findRequiredViewAsType(source, R.id.wave_mon_select_prop_value, "field 'waveMonPropValueSelect'", TextView.class);
    target.pwmSelectedModeImg = Utils.findRequiredViewAsType(source, R.id.pwm_ic_img, "field 'pwmSelectedModeImg'", ImageView.class);
    target.pwmMonSelectMode = Utils.findRequiredViewAsType(source, R.id.pwm_mon_mode_select, "field 'pwmMonSelectMode'", TextView.class);
    target.pwmFreqValue = Utils.findRequiredViewAsType(source, R.id.pwm_freq_value, "field 'pwmFreqValue'", TextView.class);
    target.pwmPhaseValue = Utils.findRequiredViewAsType(source, R.id.pwm_phase_value, "field 'pwmPhaseValue'", TextView.class);
    target.pwmDutyValue = Utils.findRequiredViewAsType(source, R.id.pwm_duty_value, "field 'pwmDutyValue'", TextView.class);
    target.pwmMonPropSelect = Utils.findRequiredViewAsType(source, R.id.pwm_mon_select_prop, "field 'pwmMonPropSelect'", TextView.class);
    target.pwmMonPropSelectValue = Utils.findRequiredViewAsType(source, R.id.pwm_mon_select_prop_value, "field 'pwmMonPropSelectValue'", TextView.class);
    target.btnCtrlWave1 = Utils.findRequiredViewAsType(source, R.id.ctrl_btn_wave1, "field 'btnCtrlWave1'", Button.class);
    target.btnCtrlWave2 = Utils.findRequiredViewAsType(source, R.id.ctrl_btn_wave2, "field 'btnCtrlWave2'", Button.class);
    target.btnCtrlFreq = Utils.findRequiredViewAsType(source, R.id.ctrl_btn_freq, "field 'btnCtrlFreq'", Button.class);
    target.btnCtrlPhase = Utils.findRequiredViewAsType(source, R.id.ctrl_btn_phase, "field 'btnCtrlPhase'", Button.class);
    target.imgBtnSin = Utils.findRequiredViewAsType(source, R.id.ctrl_img_btn_sin, "field 'imgBtnSin'", ImageButton.class);
    target.imgBtnTri = Utils.findRequiredViewAsType(source, R.id.ctrl_img_btn_tri, "field 'imgBtnTri'", ImageButton.class);
    target.btnPwmSq1 = Utils.findRequiredViewAsType(source, R.id.pwm_btn_sq1, "field 'btnPwmSq1'", Button.class);
    target.btnPwmSq2 = Utils.findRequiredViewAsType(source, R.id.pwm_btn_sq2, "field 'btnPwmSq2'", Button.class);
    target.btnPwmSq3 = Utils.findRequiredViewAsType(source, R.id.pwm_btn_sq3, "field 'btnPwmSq3'", Button.class);
    target.btnPwmSq4 = Utils.findRequiredViewAsType(source, R.id.pwm_btn_sq4, "field 'btnPwmSq4'", Button.class);
    target.btnAnalogMode = Utils.findRequiredViewAsType(source, R.id.analog_mode_btn, "field 'btnAnalogMode'", Button.class);
    target.btnDigitalMode = Utils.findRequiredViewAsType(source, R.id.digital_mode_btn, "field 'btnDigitalMode'", Button.class);
    target.pwmBtnFreq = Utils.findRequiredViewAsType(source, R.id.pwm_btn_freq, "field 'pwmBtnFreq'", Button.class);
    target.pwmBtnDuty = Utils.findRequiredViewAsType(source, R.id.pwm_btn_duty, "field 'pwmBtnDuty'", Button.class);
    target.pwmBtnPhase = Utils.findRequiredViewAsType(source, R.id.pwm_btn_phase, "field 'pwmBtnPhase'", Button.class);
    target.imgBtnUp = Utils.findRequiredViewAsType(source, R.id.img_btn_up, "field 'imgBtnUp'", ImageButton.class);
    target.imgBtnDown = Utils.findRequiredViewAsType(source, R.id.img_btn_down, "field 'imgBtnDown'", ImageButton.class);
    target.seekBar = Utils.findRequiredViewAsType(source, R.id.seek_bar_wave_gen, "field 'seekBar'", IndicatorSeekBar.class);
    target.wavePhaseTitle = Utils.findRequiredViewAsType(source, R.id.wave_phase, "field 'wavePhaseTitle'", TextView.class);
    target.btnProduceSound = Utils.findRequiredViewAsType(source, R.id.btn_produce_sound, "field 'btnProduceSound'", Button.class);
  }

  @Override
  public void unbind() {
    WaveGeneratorActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.selectedWaveImg = null;
    target.selectedWaveText = null;
    target.waveFreqValue = null;
    target.wavePhaseValue = null;
    target.waveMonPropSelect = null;
    target.waveMonPropValueSelect = null;
    target.pwmSelectedModeImg = null;
    target.pwmMonSelectMode = null;
    target.pwmFreqValue = null;
    target.pwmPhaseValue = null;
    target.pwmDutyValue = null;
    target.pwmMonPropSelect = null;
    target.pwmMonPropSelectValue = null;
    target.btnCtrlWave1 = null;
    target.btnCtrlWave2 = null;
    target.btnCtrlFreq = null;
    target.btnCtrlPhase = null;
    target.imgBtnSin = null;
    target.imgBtnTri = null;
    target.btnPwmSq1 = null;
    target.btnPwmSq2 = null;
    target.btnPwmSq3 = null;
    target.btnPwmSq4 = null;
    target.btnAnalogMode = null;
    target.btnDigitalMode = null;
    target.pwmBtnFreq = null;
    target.pwmBtnDuty = null;
    target.pwmBtnPhase = null;
    target.imgBtnUp = null;
    target.imgBtnDown = null;
    target.seekBar = null;
    target.wavePhaseTitle = null;
    target.btnProduceSound = null;

    super.unbind();
  }
}
