// this section was generated automatically by rusEFI tool ConfigDefinition.jar based on (unknown script) console/binary/output_channels.txt Wed May 03 20:01:24 UTC 2023
// by class com.rusefi.output.CHeaderConsumer
// begin
#pragma once
#include "rusefi_types.h"
// start of pid_status_s
struct pid_status_s {
	/**
	 * offset 0
	 */
	float pTerm = (float)0;
	/**
	 * offset 4
	 */
	scaled_channel<int16_t, 100, 1> iTerm = (int16_t)0;
	/**
	 * offset 6
	 */
	scaled_channel<int16_t, 100, 1> dTerm = (int16_t)0;
	/**
	 * offset 8
	 */
	scaled_channel<int16_t, 100, 1> output = (int16_t)0;
	/**
	 * offset 10
	 */
	scaled_channel<int16_t, 100, 1> error = (int16_t)0;
	/**
	 * offset 12
	 */
	uint32_t resetCounter = (uint32_t)0;
};
static_assert(sizeof(pid_status_s) == 16);

// start of output_channels_s
struct output_channels_s {
	/**
	offset 0 bit 0 */
	bool sd_present : 1 {};
	/**
	offset 0 bit 1 */
	bool sd_logging_internal : 1 {};
	/**
	offset 0 bit 2 */
	bool triggerScopeReady : 1 {};
	/**
	offset 0 bit 3 */
	bool antilagTriggered : 1 {};
	/**
	 * radiator fan
	offset 0 bit 4 */
	bool isFanOn : 1 {};
	/**
	offset 0 bit 5 */
	bool isO2HeaterOn : 1 {};
	/**
	offset 0 bit 6 */
	bool checkEngine : 1 {};
	/**
	offset 0 bit 7 */
	bool needBurn : 1 {};
	/**
	offset 0 bit 8 */
	bool sd_msd : 1 {};
	/**
	offset 0 bit 9 */
	bool isFan2On : 1 {};
	/**
	offset 0 bit 10 */
	bool unusedBitLAtwfs : 1 {};
	/**
	offset 0 bit 11 */
	bool toothLogReady : 1 {};
	/**
	offset 0 bit 12 */
	bool unused3123 : 1 {};
	/**
	offset 0 bit 13 */
	bool isTpsError : 1 {};
	/**
	offset 0 bit 14 */
	bool isCltError : 1 {};
	/**
	offset 0 bit 15 */
	bool isMapError : 1 {};
	/**
	offset 0 bit 16 */
	bool isIatError : 1 {};
	/**
	offset 0 bit 17 */
	bool unused131313 : 1 {};
	/**
	offset 0 bit 18 */
	bool isTriggerError : 1 {};
	/**
	offset 0 bit 19 */
	bool hasCriticalError : 1 {};
	/**
	offset 0 bit 20 */
	bool isWarnNow : 1 {};
	/**
	offset 0 bit 21 */
	bool isPedalError : 1 {};
	/**
	offset 0 bit 22 */
	bool isKnockChipOk : 1 {};
	/**
	offset 0 bit 23 */
	bool launchTriggered : 1 {};
	/**
	offset 0 bit 24 */
	bool isTps2Error : 1 {};
	/**
	offset 0 bit 25 */
	bool isIdleClosedLoop : 1 {};
	/**
	offset 0 bit 26 */
	bool unusedBit_26_26 : 1 {};
	/**
	offset 0 bit 27 */
	bool unusedBit_26_27 : 1 {};
	/**
	offset 0 bit 28 */
	bool unusedBit_26_28 : 1 {};
	/**
	offset 0 bit 29 */
	bool unusedBit_26_29 : 1 {};
	/**
	offset 0 bit 30 */
	bool unusedBit_26_30 : 1 {};
	/**
	offset 0 bit 31 */
	bool unusedBit_26_31 : 1 {};
	/**
	 * @@GAUGE_NAME_RPM@@
	RPM
	 * offset 4
	 */
	uint16_t RPMValue = (uint16_t)0;
	/**
	 * dRPM
	RPM/s
	 * offset 6
	 */
	uint16_t rpmAcceleration = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_GEAR_RATIO@@
	value
	 * offset 8
	 */
	scaled_channel<uint16_t, 100, 1> speedToRpmRatio = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_VVS@@
	kph
	 * offset 10
	 */
	uint8_t unusedVehicleSpeedKph = (uint8_t)0;
	/**
	 * @@GAUGE_NAME_CPU_TEMP@@
	deg C
	 * offset 11
	 */
	int8_t internalMcuTemperature = (int8_t)0;
	/**
	 * @@GAUGE_NAME_CLT@@
	deg C
	 * offset 12
	 */
	scaled_channel<int16_t, 100, 1> coolant = (int16_t)0;
	/**
	 * @@GAUGE_NAME_IAT@@
	deg C
	 * offset 14
	 */
	scaled_channel<int16_t, 100, 1> intake = (int16_t)0;
	/**
	deg C
	 * offset 16
	 */
	scaled_channel<int16_t, 100, 1> auxTemp1 = (int16_t)0;
	/**
	deg C
	 * offset 18
	 */
	scaled_channel<int16_t, 100, 1> auxTemp2 = (int16_t)0;
	/**
	 * @@GAUGE_NAME_TPS@@
	%
	 * offset 20
	 */
	scaled_channel<int16_t, 100, 1> TPSValue = (int16_t)0;
	/**
	 * @@GAUGE_NAME_THROTTLE_PEDAL@@
	%
	 * offset 22
	 */
	scaled_channel<int16_t, 100, 1> throttlePedalPosition = (int16_t)0;
	/**
	ADC
	 * offset 24
	 */
	uint16_t tpsADC = (uint16_t)0;
	/**
	V
	 * offset 26
	 */
	scaled_channel<uint16_t, 1000, 1> rawMaf = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_AIR_FLOW_MEASURED@@
	kg/h
	 * offset 28
	 */
	scaled_channel<uint16_t, 10, 1> mafMeasured = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_MAP@@
	kPa
	 * offset 30
	 */
	scaled_channel<uint16_t, 30, 1> MAPValue = (uint16_t)0;
	/**
	kPa
	 * offset 32
	 */
	scaled_channel<uint16_t, 30, 1> baroPressure = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_LAMBDA@@
	 * offset 34
	 */
	scaled_channel<uint16_t, 10000, 1> lambdaValue = (uint16_t)0;
	/**
	%
	 * offset 36
	 */
	scaled_channel<uint8_t, 2, 1> idleCurrentPosition = (uint8_t)0;
	/**
	 * need 4 byte alignment
	units
	 * offset 37
	 */
	uint8_t alignmentFill_at_37[1];
	/**
	 * @@GAUGE_NAME_VBAT@@
	V
	 * offset 38
	 */
	scaled_channel<uint16_t, 1000, 1> VBatt = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_OIL_PRESSURE@@
	kPa
	 * offset 40
	 */
	scaled_channel<uint16_t, 30, 1> oilPressure = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_VVT_B1I@@
	deg
	 * offset 42
	 */
	scaled_channel<int16_t, 50, 1> vvtPositionB1I = (int16_t)0;
	/**
	 * @@GAUGE_NAME_AIR_MASS@@
	g
	 * offset 44
	 */
	scaled_channel<uint16_t, 1000, 1> chargeAirMass = (uint16_t)0;
	/**
	 * crankingFuelMs
	 * airmass in mg, 0-65 grams
	ms
	 * offset 46
	 */
	scaled_channel<uint16_t, 100, 1> crankingFuelMs = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_BASE@@
	 * This is the raw value we take from the fuel map or base fuel algorithm, before the corrections
	mg
	 * offset 48
	 */
	scaled_channel<uint16_t, 100, 1> baseFuel = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_RUNNING@@
	 * Total fuel with CLT IAT and TPS acceleration without injector lag corrections per cycle, as pulse per cycle
	mg
	 * offset 50
	 */
	scaled_channel<uint16_t, 100, 1> fuelRunning = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_LAST_INJECTION@@
	 * Actual last injection time - including all compensation and injection mode
	ms
	 * offset 52
	 */
	scaled_channel<uint16_t, 300, 1> actualLastInjection = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_INJ_DUTY@@
	%
	 * offset 54
	 */
	scaled_channel<uint8_t, 2, 1> injectorDutyCycle = (uint8_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_VE@@
	ratio
	 * offset 55
	 */
	scaled_channel<uint8_t, 2, 1> veValue = (uint8_t)0;
	/**
	deg
	 * offset 56
	 */
	int16_t injectionOffset = (int16_t)0;
	/**
	deg C
	 * offset 58
	 */
	scaled_channel<int16_t, 100, 1> tCharge = (int16_t)0;
	/**
	 * @@GAUGE_NAME_INJECTOR_LAG@@
	ms
	 * offset 60
	 */
	scaled_channel<uint16_t, 300, 1> injectorLagMs = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_ENGINE_CRC16@@
	crc16
	 * offset 62
	 */
	uint16_t engineMakeCodeNameCrc16 = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_WALL_AMOUNT@@
	mg
	 * offset 64
	 */
	scaled_channel<uint16_t, 100, 1> wallFuelAmount = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_WALL_CORRECTION@@
	mg
	 * offset 66
	 */
	scaled_channel<int16_t, 100, 1> wallFuelCorrectionValue = (int16_t)0;
	/**
	 * offset 68
	 */
	uint16_t revolutionCounterSinceStart = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_TPS_ROC@@
	ratio
	 * offset 70
	 */
	scaled_channel<int16_t, 100, 1> deltaTpsValue = (int16_t)0;
	/**
	 * offset 72
	 */
	uint16_t canReadCounter = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_TPS_EXTRA@@
	ms
	 * offset 74
	 */
	scaled_channel<int16_t, 300, 1> tpsAccelFuel = (int16_t)0;
	/**
	 * @@GAUGE_NAME_WARNING_COUNTER@@
	count
	 * offset 76
	 */
	uint16_t warningCounter = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_WARNING_LAST@@
	error
	 * offset 78
	 */
	uint16_t lastErrorCode = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_DWELL_DUTY@@
	%
	 * offset 80
	 */
	scaled_channel<uint16_t, 100, 1> coilDutyCycle = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_IAC@@
	%
	 * offset 82
	 */
	scaled_channel<uint16_t, 100, 1> idleAirValvePosition = (uint16_t)0;
	/**
	 * ETB Target
	%
	 * offset 84
	 */
	scaled_channel<int16_t, 100, 1> etbTarget = (int16_t)0;
	/**
	 * @@GAUGE_NAME_ETB_DUTY@@
	%
	 * offset 86
	 */
	scaled_channel<int16_t, 100, 1> etb1DutyCycle = (int16_t)0;
	/**
	 * Fuel level
	%
	 * offset 88
	 */
	scaled_channel<int16_t, 100, 1> fuelTankLevel = (int16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_CONSUMPTION@@
	grams
	 * offset 90
	 */
	uint16_t totalFuelConsumption = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_FLOW@@
	gram/s
	 * offset 92
	 */
	scaled_channel<uint16_t, 200, 1> fuelFlowRate = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_TPS2@@
	%
	 * offset 94
	 */
	scaled_channel<int16_t, 100, 1> TPS2Value = (int16_t)0;
	/**
	 * @@GAUGE_NAME_TUNE_CRC16@@
	crc16
	 * offset 96
	 */
	uint16_t tuneCrc16 = (uint16_t)0;
	/**
	 * need 4 byte alignment
	units
	 * offset 98
	 */
	uint8_t alignmentFill_at_98[2];
	/**
	 * @@GAUGE_NAME_KNOCK_LEVEL@@
	Volts
	 * offset 100
	 */
	float knockLevel = (float)0;
	/**
	 * @@GAUGE_NAME_UPTIME@@
	sec
	 * offset 104
	 */
	uint32_t seconds = (uint32_t)0;
	/**
	 * Engine Mode
	em
	 * offset 108
	 */
	uint32_t engineMode = (uint32_t)0;
	/**
	 * @@GAUGE_NAME_VERSION@@
	version_f
	 * offset 112
	 */
	uint32_t firmwareVersion = (uint32_t)0;
	/**
	V
	 * offset 116
	 */
	scaled_channel<int16_t, 1000, 1> rawIdlePositionSensor = (int16_t)0;
	/**
	V
	 * offset 118
	 */
	scaled_channel<int16_t, 1000, 1> rawWastegatePosition = (int16_t)0;
	/**
	 * @@GAUGE_NAME_ACCEL_X@@
	G
	 * offset 120
	 */
	scaled_channel<int16_t, 100, 1> accelerationX = (int16_t)0;
	/**
	 * @@GAUGE_NAME_ACCEL_Y@@
	G
	 * offset 122
	 */
	scaled_channel<int16_t, 100, 1> accelerationY = (int16_t)0;
	/**
	 * offset 124
	 */
	uint32_t tsConfigVersion = (uint32_t)0;
	/**
	 * offset 128
	 */
	float calibrationValue = (float)0;
	/**
	 * offset 132
	 */
	uint8_t calibrationMode = (uint8_t)0;
	/**
	 * offset 133
	 */
	uint8_t idleTargetPosition = (uint8_t)0;
	/**
	 * @@GAUGE_NAME_DETECTED_GEAR@@
	 * offset 134
	 */
	uint8_t detectedGear = (uint8_t)0;
	/**
	 * offset 135
	 */
	uint8_t maxTriggerReentrant = (uint8_t)0;
	/**
	 * @@GAUGE_NAME_TRG_ERR@@
	counter
	 * offset 136
	 */
	uint32_t totalTriggerErrorCounter = (uint32_t)0;
	/**
	 * offset 140
	 */
	uint32_t orderingErrorCounter = (uint32_t)0;
	/**
	error
	 * offset 144
	 */
	uint16_t recentErrorCode[8];
	/**
	val
	 * offset 160
	 */
	float debugFloatField1 = (float)0;
	/**
	val
	 * offset 164
	 */
	float debugFloatField2 = (float)0;
	/**
	val
	 * offset 168
	 */
	float debugFloatField3 = (float)0;
	/**
	val
	 * offset 172
	 */
	float debugFloatField4 = (float)0;
	/**
	val
	 * offset 176
	 */
	float debugFloatField5 = (float)0;
	/**
	val
	 * offset 180
	 */
	float debugFloatField6 = (float)0;
	/**
	val
	 * offset 184
	 */
	float debugFloatField7 = (float)0;
	/**
	val
	 * offset 188
	 */
	uint32_t debugIntField1 = (uint32_t)0;
	/**
	val
	 * offset 192
	 */
	uint32_t debugIntField2 = (uint32_t)0;
	/**
	val
	 * offset 196
	 */
	uint32_t debugIntField3 = (uint32_t)0;
	/**
	val
	 * offset 200
	 */
	int16_t debugIntField4 = (int16_t)0;
	/**
	val
	 * offset 202
	 */
	int16_t debugIntField5 = (int16_t)0;
	/**
	deg C
	 * offset 204
	 */
	uint16_t egt[EGT_CHANNEL_COUNT];
	/**
	V
	 * offset 220
	 */
	scaled_channel<int16_t, 1000, 1> rawTps1Primary = (int16_t)0;
	/**
	V
	 * offset 222
	 */
	scaled_channel<int16_t, 1000, 1> rawPpsPrimary = (int16_t)0;
	/**
	V
	 * offset 224
	 */
	scaled_channel<int16_t, 1000, 1> rawClt = (int16_t)0;
	/**
	V
	 * offset 226
	 */
	scaled_channel<int16_t, 1000, 1> rawIat = (int16_t)0;
	/**
	V
	 * offset 228
	 */
	scaled_channel<int16_t, 1000, 1> rawOilPressure = (int16_t)0;
	/**
	 * offset 230
	 */
	uint8_t fuelClosedLoopBinIdx = (uint8_t)0;
	/**
	 * @@GAUGE_NAME_CURRENT_GEAR@@
	gear
	 * offset 231
	 */
	int8_t tcuCurrentGear = (int8_t)0;
	/**
	V
	 * offset 232
	 */
	scaled_channel<int16_t, 1000, 1> rawPpsSecondary = (int16_t)0;
	/**
	dBv
	 * offset 234
	 */
	int8_t knock[12];
	/**
	 * @@GAUGE_NAME_DESIRED_GEAR@@
	gear
	 * offset 246
	 */
	int8_t tcuDesiredGear = (int8_t)0;
	/**
	 * @@GAUGE_NAME_FLEX@@
	%
	 * offset 247
	 */
	scaled_channel<uint8_t, 2, 1> flexPercent = (uint8_t)0;
	/**
	 * @@GAUGE_NAME_WG_POSITION@@
	%
	 * offset 248
	 */
	scaled_channel<int16_t, 100, 1> wastegatePositionSensor = (int16_t)0;
	/**
	 * @@GAUGE_NAME_IDLE_POSITION@@
	%
	 * offset 250
	 */
	scaled_channel<int16_t, 100, 1> idlePositionSensor = (int16_t)0;
	/**
	V
	 * offset 252
	 */
	scaled_channel<int16_t, 1000, 1> rawLowFuelPressure = (int16_t)0;
	/**
	V
	 * offset 254
	 */
	scaled_channel<int16_t, 1000, 1> rawHighFuelPressure = (int16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_PRESSURE_LOW@@
	kpa
	 * offset 256
	 */
	scaled_channel<int16_t, 30, 1> lowFuelPressure = (int16_t)0;
	/**
	 * @@GAUGE_NAME_FUEL_PRESSURE_HIGH@@
	bar
	 * offset 258
	 */
	scaled_channel<int16_t, 10, 1> highFuelPressure = (int16_t)0;
	/**
	 * @@GAUGE_NAME_AFR@@
	AFR
	 * offset 260
	 */
	scaled_channel<uint16_t, 1000, 1> AFRValue = (uint16_t)0;
	/**
	 * Vss Accel
	m/s2
	 * offset 262
	 */
	scaled_channel<uint16_t, 300, 1> VssAcceleration = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_LAMBDA2@@
	 * offset 264
	 */
	scaled_channel<uint16_t, 10000, 1> lambdaValue2 = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_AFR2@@
	AFR
	 * offset 266
	 */
	scaled_channel<uint16_t, 1000, 1> AFRValue2 = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_VVT_B1E@@
	deg
	 * offset 268
	 */
	scaled_channel<int16_t, 50, 1> vvtPositionB1E = (int16_t)0;
	/**
	 * @@GAUGE_NAME_VVT_B2I@@
	deg
	 * offset 270
	 */
	scaled_channel<int16_t, 50, 1> vvtPositionB2I = (int16_t)0;
	/**
	 * @@GAUGE_NAME_VVT_B2E@@
	deg
	 * offset 272
	 */
	scaled_channel<int16_t, 50, 1> vvtPositionB2E = (int16_t)0;
	/**
	%
	 * offset 274
	 */
	scaled_channel<int16_t, 100, 1> fuelPidCorrection[2];
	/**
	V
	 * offset 278
	 */
	scaled_channel<int16_t, 1000, 1> rawTps1Secondary = (int16_t)0;
	/**
	V
	 * offset 280
	 */
	scaled_channel<int16_t, 1000, 1> rawTps2Primary = (int16_t)0;
	/**
	V
	 * offset 282
	 */
	scaled_channel<int16_t, 1000, 1> rawTps2Secondary = (int16_t)0;
	/**
	 * @@GAUGE_NAME_ACCEL_Z@@
	G
	 * offset 284
	 */
	scaled_channel<int16_t, 100, 1> accelerationZ = (int16_t)0;
	/**
	 * @@GAUGE_NAME_ACCEL_ROLL@@
	G
	 * offset 286
	 */
	scaled_channel<int16_t, 100, 1> accelerationRoll = (int16_t)0;
	/**
	 * @@GAUGE_NAME_ACCEL_YAW@@
	G
	 * offset 288
	 */
	scaled_channel<int16_t, 100, 1> accelerationYaw = (int16_t)0;
	/**
	deg
	 * offset 290
	 */
	int8_t vvtTargets[4];
	/**
	 * @@GAUGE_NAME_TURBO_SPEED@@
	hz
	 * offset 294
	 */
	uint16_t turboSpeed = (uint16_t)0;
	/**
	%
	 * offset 296
	 */
	scaled_channel<int16_t, 100, 1> tps1Split = (int16_t)0;
	/**
	%
	 * offset 298
	 */
	scaled_channel<int16_t, 100, 1> tps2Split = (int16_t)0;
	/**
	%
	 * offset 300
	 */
	scaled_channel<int16_t, 100, 1> tps12Split = (int16_t)0;
	/**
	%
	 * offset 302
	 */
	scaled_channel<int16_t, 100, 1> accPedalSplit = (int16_t)0;
	/**
	 * Spark Cut Code
	code
	 * offset 304
	 */
	int8_t sparkCutReason = (int8_t)0;
	/**
	 * Fuel Cut Code
	code
	 * offset 305
	 */
	int8_t fuelCutReason = (int8_t)0;
	/**
	 * @@GAUGE_NAME_AIR_FLOW_ESTIMATE@@
	kg/h
	 * offset 306
	 */
	scaled_channel<uint16_t, 10, 1> mafEstimate = (uint16_t)0;
	/**
	 * sync: instant RPM
	rpm
	 * offset 308
	 */
	uint16_t instantRpm = (uint16_t)0;
	/**
	counter
	 * offset 310
	 */
	uint16_t systemEventReuse = (uint16_t)0;
	/**
	V
	 * offset 312
	 */
	scaled_channel<uint16_t, 1000, 1> rawMap = (uint16_t)0;
	/**
	V
	 * offset 314
	 */
	scaled_channel<uint16_t, 1000, 1> rawAfr = (uint16_t)0;
	/**
	%
	 * offset 316
	 */
	uint8_t tpsAccelFrom = (uint8_t)0;
	/**
	%
	 * offset 317
	 */
	uint8_t tpsAccelTo = (uint8_t)0;
	/**
	 * need 4 byte alignment
	units
	 * offset 318
	 */
	uint8_t alignmentFill_at_318[2];
	/**
	 * offset 320
	 */
	float calibrationValue2 = (float)0;
	/**
	offset 324 bit 0 */
	bool isMainRelayOn : 1 {};
	/**
	 * isUsbConnected
	 * Original reason for this is to check if USB is connected from Lua
	offset 324 bit 1 */
	bool isUsbConnected : 1 {};
	/**
	offset 324 bit 2 */
	bool unusedBit_163_2 : 1 {};
	/**
	offset 324 bit 3 */
	bool unusedBit_163_3 : 1 {};
	/**
	offset 324 bit 4 */
	bool unusedBit_163_4 : 1 {};
	/**
	offset 324 bit 5 */
	bool unusedBit_163_5 : 1 {};
	/**
	offset 324 bit 6 */
	bool unusedBit_163_6 : 1 {};
	/**
	offset 324 bit 7 */
	bool unusedBit_163_7 : 1 {};
	/**
	offset 324 bit 8 */
	bool unusedBit_163_8 : 1 {};
	/**
	offset 324 bit 9 */
	bool unusedBit_163_9 : 1 {};
	/**
	offset 324 bit 10 */
	bool unusedBit_163_10 : 1 {};
	/**
	offset 324 bit 11 */
	bool unusedBit_163_11 : 1 {};
	/**
	offset 324 bit 12 */
	bool unusedBit_163_12 : 1 {};
	/**
	offset 324 bit 13 */
	bool unusedBit_163_13 : 1 {};
	/**
	offset 324 bit 14 */
	bool unusedBit_163_14 : 1 {};
	/**
	offset 324 bit 15 */
	bool unusedBit_163_15 : 1 {};
	/**
	offset 324 bit 16 */
	bool unusedBit_163_16 : 1 {};
	/**
	offset 324 bit 17 */
	bool unusedBit_163_17 : 1 {};
	/**
	offset 324 bit 18 */
	bool unusedBit_163_18 : 1 {};
	/**
	offset 324 bit 19 */
	bool unusedBit_163_19 : 1 {};
	/**
	offset 324 bit 20 */
	bool unusedBit_163_20 : 1 {};
	/**
	offset 324 bit 21 */
	bool unusedBit_163_21 : 1 {};
	/**
	offset 324 bit 22 */
	bool unusedBit_163_22 : 1 {};
	/**
	offset 324 bit 23 */
	bool unusedBit_163_23 : 1 {};
	/**
	offset 324 bit 24 */
	bool unusedBit_163_24 : 1 {};
	/**
	offset 324 bit 25 */
	bool unusedBit_163_25 : 1 {};
	/**
	offset 324 bit 26 */
	bool unusedBit_163_26 : 1 {};
	/**
	offset 324 bit 27 */
	bool unusedBit_163_27 : 1 {};
	/**
	offset 324 bit 28 */
	bool unusedBit_163_28 : 1 {};
	/**
	offset 324 bit 29 */
	bool unusedBit_163_29 : 1 {};
	/**
	offset 324 bit 30 */
	bool unusedBit_163_30 : 1 {};
	/**
	offset 324 bit 31 */
	bool unusedBit_163_31 : 1 {};
	/**
	count
	 * offset 328
	 */
	uint32_t luaInvocationCounter = (uint32_t)0;
	/**
	nt
	 * offset 332
	 */
	uint32_t luaLastCycleDuration = (uint32_t)0;
	/**
	count
	 * offset 336
	 */
	uint8_t testBenchIter = (uint8_t)0;
	/**
	 * "Current Range"
	 * offset 337
	 */
	uint8_t tcu_currentRange = (uint8_t)0;
	/**
	 * @@GAUGE_NAME_TC_RATIO@@
	value
	 * offset 338
	 */
	scaled_channel<uint16_t, 100, 1> tcRatio = (uint16_t)0;
	/**
	 * offset 340
	 */
	float lastShiftTime = (float)0;
	/**
	 * offset 344
	 */
	uint32_t vssEdgeCounter = (uint32_t)0;
	/**
	 * offset 348
	 */
	uint32_t issEdgeCounter = (uint32_t)0;
	/**
	 * @@GAUGE_NAME_AUX_LINEAR_1@@
	 * offset 352
	 */
	scaled_channel<int16_t, 100, 1> auxLinear1 = (int16_t)0;
	/**
	 * @@GAUGE_NAME_AUX_LINEAR_2@@
	 * offset 354
	 */
	scaled_channel<int16_t, 100, 1> auxLinear2 = (int16_t)0;
	/**
	offset 356 bit 0 */
	bool dfcoActive : 1 {};
	/**
	offset 356 bit 1 */
	bool tpsAccelActive : 1 {};
	/**
	offset 356 bit 2 */
	bool unusedBit_205_2 : 1 {};
	/**
	offset 356 bit 3 */
	bool unusedBit_205_3 : 1 {};
	/**
	offset 356 bit 4 */
	bool unusedBit_205_4 : 1 {};
	/**
	offset 356 bit 5 */
	bool unusedBit_205_5 : 1 {};
	/**
	offset 356 bit 6 */
	bool unusedBit_205_6 : 1 {};
	/**
	offset 356 bit 7 */
	bool unusedBit_205_7 : 1 {};
	/**
	offset 356 bit 8 */
	bool unusedBit_205_8 : 1 {};
	/**
	offset 356 bit 9 */
	bool unusedBit_205_9 : 1 {};
	/**
	offset 356 bit 10 */
	bool unusedBit_205_10 : 1 {};
	/**
	offset 356 bit 11 */
	bool unusedBit_205_11 : 1 {};
	/**
	offset 356 bit 12 */
	bool unusedBit_205_12 : 1 {};
	/**
	offset 356 bit 13 */
	bool unusedBit_205_13 : 1 {};
	/**
	offset 356 bit 14 */
	bool unusedBit_205_14 : 1 {};
	/**
	offset 356 bit 15 */
	bool unusedBit_205_15 : 1 {};
	/**
	offset 356 bit 16 */
	bool unusedBit_205_16 : 1 {};
	/**
	offset 356 bit 17 */
	bool unusedBit_205_17 : 1 {};
	/**
	offset 356 bit 18 */
	bool unusedBit_205_18 : 1 {};
	/**
	offset 356 bit 19 */
	bool unusedBit_205_19 : 1 {};
	/**
	offset 356 bit 20 */
	bool unusedBit_205_20 : 1 {};
	/**
	offset 356 bit 21 */
	bool unusedBit_205_21 : 1 {};
	/**
	offset 356 bit 22 */
	bool unusedBit_205_22 : 1 {};
	/**
	offset 356 bit 23 */
	bool unusedBit_205_23 : 1 {};
	/**
	offset 356 bit 24 */
	bool unusedBit_205_24 : 1 {};
	/**
	offset 356 bit 25 */
	bool unusedBit_205_25 : 1 {};
	/**
	offset 356 bit 26 */
	bool unusedBit_205_26 : 1 {};
	/**
	offset 356 bit 27 */
	bool unusedBit_205_27 : 1 {};
	/**
	offset 356 bit 28 */
	bool unusedBit_205_28 : 1 {};
	/**
	offset 356 bit 29 */
	bool unusedBit_205_29 : 1 {};
	/**
	offset 356 bit 30 */
	bool unusedBit_205_30 : 1 {};
	/**
	offset 356 bit 31 */
	bool unusedBit_205_31 : 1 {};
	/**
	kPa
	 * offset 360
	 */
	scaled_channel<uint16_t, 10, 1> fallbackMap = (uint16_t)0;
	/**
	 * Instant MAP
	kPa
	 * offset 362
	 */
	scaled_channel<uint16_t, 30, 1> instantMAPValue = (uint16_t)0;
	/**
	us
	 * offset 364
	 */
	uint16_t maxLockedDuration = (uint16_t)0;
	/**
	 * offset 366
	 */
	uint16_t canWriteOk = (uint16_t)0;
	/**
	 * offset 368
	 */
	uint16_t canWriteNotOk = (uint16_t)0;
	/**
	 * need 4 byte alignment
	units
	 * offset 370
	 */
	uint8_t alignmentFill_at_370[2];
	/**
	 * offset 372
	 */
	uint32_t triggerPrimaryFall = (uint32_t)0;
	/**
	 * offset 376
	 */
	uint32_t triggerPrimaryRise = (uint32_t)0;
	/**
	 * offset 380
	 */
	uint32_t triggerSecondaryFall = (uint32_t)0;
	/**
	 * offset 384
	 */
	uint32_t triggerSecondaryRise = (uint32_t)0;
	/**
	 * offset 388
	 */
	uint16_t triggerVvtFall = (uint16_t)0;
	/**
	 * offset 390
	 */
	uint16_t triggerVvtRise = (uint16_t)0;
	/**
	 * offset 392
	 */
	uint16_t triggerVvt2Fall = (uint16_t)0;
	/**
	 * offset 394
	 */
	uint16_t triggerVvt2Rise = (uint16_t)0;
	/**
	 * offset 396
	 */
	uint8_t starterState = (uint8_t)0;
	/**
	 * offset 397
	 */
	uint8_t starterRelayDisable = (uint8_t)0;
	/**
	 * offset 398
	 */
	uint8_t multiSparkCounter = (uint8_t)0;
	/**
	 * offset 399
	 */
	uint8_t extiOverflowCount = (uint8_t)0;
	/**
	 * offset 400
	 */
	pid_status_s alternatorStatus;
	/**
	 * offset 416
	 */
	pid_status_s idleStatus;
	/**
	 * offset 432
	 */
	pid_status_s etbStatus;
	/**
	 * offset 448
	 */
	pid_status_s boostStatus;
	/**
	 * offset 464
	 */
	pid_status_s wastegateDcStatus;
	/**
	 * offset 480
	 */
	pid_status_s vvtStatus[CAM_INPUTS_COUNT];
	/**
	 * aux speed 1
	s
	 * offset 544
	 */
	uint16_t auxSpeed1 = (uint16_t)0;
	/**
	 * aux speed 2
	s
	 * offset 546
	 */
	uint16_t auxSpeed2 = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_ISS@@
	RPM
	 * offset 548
	 */
	uint16_t ISSValue = (uint16_t)0;
	/**
	V
	 * offset 550
	 */
	scaled_channel<int16_t, 1000, 1> rawAnalogInput[LUA_ANALOG_INPUT_COUNT];
	/**
	 * GPPWM Output
	%
	 * offset 566
	 */
	scaled_channel<uint8_t, 2, 1> gppwmOutput[4];
	/**
	 * offset 570
	 */
	scaled_channel<int16_t, 1, 1> gppwmXAxis[4];
	/**
	 * offset 578
	 */
	scaled_channel<int16_t, 10, 1> gppwmYAxis[4];
	/**
	V
	 * offset 586
	 */
	scaled_channel<int16_t, 1000, 1> rawBattery = (int16_t)0;
	/**
	 * offset 588
	 */
	scaled_channel<int16_t, 10, 1> ignBlendParameter[IGN_BLEND_COUNT];
	/**
	%
	 * offset 596
	 */
	scaled_channel<uint8_t, 2, 1> ignBlendBias[IGN_BLEND_COUNT];
	/**
	deg
	 * offset 600
	 */
	scaled_channel<int16_t, 100, 1> ignBlendOutput[IGN_BLEND_COUNT];
	/**
	 * offset 608
	 */
	scaled_channel<int16_t, 10, 1> veBlendParameter[VE_BLEND_COUNT];
	/**
	%
	 * offset 616
	 */
	scaled_channel<uint8_t, 2, 1> veBlendBias[VE_BLEND_COUNT];
	/**
	%
	 * offset 620
	 */
	scaled_channel<int16_t, 100, 1> veBlendOutput[VE_BLEND_COUNT];
	/**
	 * offset 628
	 */
	scaled_channel<int16_t, 10, 1> boostOpenLoopBlendParameter[BOOST_BLEND_COUNT];
	/**
	%
	 * offset 632
	 */
	scaled_channel<uint8_t, 2, 1> boostOpenLoopBlendBias[BOOST_BLEND_COUNT];
	/**
	%
	 * offset 634
	 */
	scaled_channel<int8_t, 1, 1> boostOpenLoopBlendOutput[BOOST_BLEND_COUNT];
	/**
	 * offset 636
	 */
	scaled_channel<int16_t, 10, 1> boostClosedLoopBlendParameter[BOOST_BLEND_COUNT];
	/**
	%
	 * offset 640
	 */
	scaled_channel<uint8_t, 2, 1> boostClosedLoopBlendBias[BOOST_BLEND_COUNT];
	/**
	%
	 * offset 642
	 */
	scaled_channel<int16_t, 10, 1> boostClosedLoopBlendOutput[BOOST_BLEND_COUNT];
	/**
	 * need 4 byte alignment
	units
	 * offset 646
	 */
	uint8_t alignmentFill_at_646[2];
	/**
	offset 648 bit 0 */
	bool coilState1 : 1 {};
	/**
	offset 648 bit 1 */
	bool coilState2 : 1 {};
	/**
	offset 648 bit 2 */
	bool coilState3 : 1 {};
	/**
	offset 648 bit 3 */
	bool coilState4 : 1 {};
	/**
	offset 648 bit 4 */
	bool coilState5 : 1 {};
	/**
	offset 648 bit 5 */
	bool coilState6 : 1 {};
	/**
	offset 648 bit 6 */
	bool coilState7 : 1 {};
	/**
	offset 648 bit 7 */
	bool coilState8 : 1 {};
	/**
	offset 648 bit 8 */
	bool coilState9 : 1 {};
	/**
	offset 648 bit 9 */
	bool coilState10 : 1 {};
	/**
	offset 648 bit 10 */
	bool coilState11 : 1 {};
	/**
	offset 648 bit 11 */
	bool coilState12 : 1 {};
	/**
	offset 648 bit 12 */
	bool injectorState1 : 1 {};
	/**
	offset 648 bit 13 */
	bool injectorState2 : 1 {};
	/**
	offset 648 bit 14 */
	bool injectorState3 : 1 {};
	/**
	offset 648 bit 15 */
	bool injectorState4 : 1 {};
	/**
	offset 648 bit 16 */
	bool injectorState5 : 1 {};
	/**
	offset 648 bit 17 */
	bool injectorState6 : 1 {};
	/**
	offset 648 bit 18 */
	bool injectorState7 : 1 {};
	/**
	offset 648 bit 19 */
	bool injectorState8 : 1 {};
	/**
	offset 648 bit 20 */
	bool injectorState9 : 1 {};
	/**
	offset 648 bit 21 */
	bool injectorState10 : 1 {};
	/**
	offset 648 bit 22 */
	bool injectorState11 : 1 {};
	/**
	offset 648 bit 23 */
	bool injectorState12 : 1 {};
	/**
	offset 648 bit 24 */
	bool triggerChannel1 : 1 {};
	/**
	offset 648 bit 25 */
	bool triggerChannel2 : 1 {};
	/**
	offset 648 bit 26 */
	bool vvtChannel1 : 1 {};
	/**
	offset 648 bit 27 */
	bool vvtChannel2 : 1 {};
	/**
	offset 648 bit 28 */
	bool vvtChannel3 : 1 {};
	/**
	offset 648 bit 29 */
	bool vvtChannel4 : 1 {};
	/**
	offset 648 bit 30 */
	bool unusedBit_310_30 : 1 {};
	/**
	offset 648 bit 31 */
	bool unusedBit_310_31 : 1 {};
	/**
	 * offset 652
	 */
	uint32_t outputRequestPeriod = (uint32_t)0;
	/**
	 * offset 656
	 */
	float mapFast = (float)0;
	/**
	value
	 * offset 660
	 */
	float luaGauges[LUA_GAUGE_COUNT];
	/**
	V
	 * offset 668
	 */
	scaled_channel<uint16_t, 1000, 1> rawMaf2 = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_AIR_FLOW_MEASURED_2@@
	kg/h
	 * offset 670
	 */
	scaled_channel<uint16_t, 10, 1> mafMeasured2 = (uint16_t)0;
	/**
	 * offset 672
	 */
	uint16_t schedulingUsedCount = (uint16_t)0;
	/**
	 * @@GAUGE_NAME_VVS@@
	kph
	 * offset 674
	 */
	scaled_channel<uint16_t, 100, 1> vehicleSpeedKph = (uint16_t)0;
	/**
	 * offset 676
	 */
	uint8_t unusedAtTheEnd[136];
};
static_assert(sizeof(output_channels_s) == 812);

// end
// this section was generated automatically by rusEFI tool ConfigDefinition.jar based on (unknown script) console/binary/output_channels.txt Wed May 03 20:01:24 UTC 2023
