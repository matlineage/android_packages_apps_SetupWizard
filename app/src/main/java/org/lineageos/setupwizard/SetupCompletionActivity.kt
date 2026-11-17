/*
 * SPDX-FileCopyrightText: The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.setupwizard

import android.os.Bundle
import android.util.Log
import org.lineageos.setupwizard.base.BaseSetupWizardActivity
import org.lineageos.setupwizard.util.SetupWizardUtils

class SetupCompletionActivity : BaseSetupWizardActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (LOGV) {
            Log.v(TAG, "onCreate")
        }
        SetupWizardUtils.finishSetupWizard(this)
    }

    override val layoutResId = -1

    override val installFooterBar = false

    companion object {
        private const val TAG = "SetupCompletionActivity"
    }
}
