package tachiyomi.data.extension.prefs

import tachiyomi.core.prefs.Preference
import tachiyomi.core.prefs.PreferenceStore

internal class ExtensionPreferences constructor(private val preferenceStore: PreferenceStore) {

  fun trustedSignatures(): Preference<Set<String>> {
    return preferenceStore.getStringSet("trusted_signatures", emptySet())
  }

}
