@JsonClass(generateAdapter = true)
data class Manifest(
    @Json(name = "exposureKeySets") val exposureKeysSetIds: List<String>,
    @Json(name = "riskCalculationParameters") val riskCalculationParametersId: String,
    @Json(name = "appConfig") val appConfigId: String
)
