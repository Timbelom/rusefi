package com.rusefi.config.generated;

// this file was generated automatically by rusEFI tool ConfigDefinition.jar based on (unknown script) console/binary/output_channels.txt Wed May 03 20:01:24 UTC 2023

// by class com.rusefi.output.FileJavaFieldsConsumer
import com.rusefi.config.*;

public class TsOutputs {
	public static final int BANKS_COUNT = 2;
	public static final int BOOST_BLEND_COUNT = 2;
	public static final int CAM_INPUTS_COUNT = 4;
	public static final int CAMS_PER_BANK = 2;
	public static final int EGT_CHANNEL_COUNT = 8;
	public static final String GAUGE_CATEGORY_BOOST_CONTROL = "Boost Control";
	public static final String GAUGE_CATEGORY_ETB = "ETB more";
	public static final String GAUGE_CATEGORY_FUEL_MATH = "Fuel: math";
	public static final String GAUGE_CATEGORY_SYNC = "Sync";
	public static final String GAUGE_CATEGORY_TIMING = "Timing";
	public static final String GAUGE_COIL_DWELL_TIME = "dwell: coil charge time";
	public static final String GAUGE_NAME_ACCEL_ROLL = "Acceleration: Roll";
	public static final String GAUGE_NAME_ACCEL_X = "Acceleration: X";
	public static final String GAUGE_NAME_ACCEL_Y = "Acceleration: Y";
	public static final String GAUGE_NAME_ACCEL_YAW = "Acceleration: Yaw";
	public static final String GAUGE_NAME_ACCEL_Z = "Acceleration: Z";
	public static final String GAUGE_NAME_ADJUSTED_TIMING = "Timing: ignition";
	public static final String GAUGE_NAME_AFR = "Air/Fuel Ratio";
	public static final String GAUGE_NAME_AFR2 = "Air/Fuel Ratio 2";
	public static final String GAUGE_NAME_AIR_FLOW_ESTIMATE = "MAF estimate";
	public static final String GAUGE_NAME_AIR_FLOW_MEASURED = "MAF";
	public static final String GAUGE_NAME_AIR_FLOW_MEASURED_2 = "MAF #2";
	public static final String GAUGE_NAME_AIR_MASS = "air mass";
	public static final String GAUGE_NAME_AUX_LINEAR_1 = "Aux Linear #1";
	public static final String GAUGE_NAME_AUX_LINEAR_2 = "Aux Linear #2";
	public static final String GAUGE_NAME_AUX_TEMP1 = "Aux temp 1";
	public static final String GAUGE_NAME_AUX_TEMP2 = "Aux temp 2";
	public static final String GAUGE_NAME_BARO_PRESSURE = "Barometric pressure";
	public static final String GAUGE_NAME_BOOST_CLOSED_LOOP = "Boost Closed Loop";
	public static final String GAUGE_NAME_BOOST_OPEN_LOOP = "Boost Open Loop";
	public static final String GAUGE_NAME_BOOST_OUTPUT = "Boost Output";
	public static final String GAUGE_NAME_BOOST_TARGET = "Boost Target";
	public static final String GAUGE_NAME_CLT = "CLT";
	public static final String GAUGE_NAME_CPU_TEMP = "CPU Temperature";
	public static final String GAUGE_NAME_CURRENT_GEAR = "Current Gear";
	public static final String GAUGE_NAME_DEBUG_F1 = "debug f1";
	public static final String GAUGE_NAME_DEBUG_F2 = "debug f2: iTerm";
	public static final String GAUGE_NAME_DEBUG_F3 = "debug f3: prevError";
	public static final String GAUGE_NAME_DEBUG_F4 = "debug f4: iParam";
	public static final String GAUGE_NAME_DEBUG_F5 = "debug f5: dParam";
	public static final String GAUGE_NAME_DEBUG_F6 = "debug f6: dTerm";
	public static final String GAUGE_NAME_DEBUG_F7 = "debug f7";
	public static final String GAUGE_NAME_DEBUG_I1 = "debug i1: pParam";
	public static final String GAUGE_NAME_DEBUG_I2 = "debug i2: offset";
	public static final String GAUGE_NAME_DEBUG_I3 = "debug i3";
	public static final String GAUGE_NAME_DEBUG_I4 = "debug i4";
	public static final String GAUGE_NAME_DEBUG_I5 = "debug i5";
	public static final String GAUGE_NAME_DESIRED_GEAR = "Desired Gear";
	public static final String GAUGE_NAME_DETECTED_GEAR = "Detected Gear";
	public static final String GAUGE_NAME_DWELL_DUTY = "dwell: coil duty cycle";
	public static final String GAUGE_NAME_ECU_TEMPERATURE = "ECU temperature";
	public static final String GAUGE_NAME_ENGINE_CRC16 = "Engine CRC16";
	public static final String GAUGE_NAME_ETB_DUTY = "ETB Duty";
	public static final String GAUGE_NAME_ETB_ERROR = "ETB position error";
	public static final String GAUGE_NAME_ETB_TARGET = "ETB position target";
	public static final String GAUGE_NAME_FLEX = "Flex Ethanol %";
	public static final String GAUGE_NAME_FUEL_BARO_CORR = "fuel: Barometric pressure mult";
	public static final String GAUGE_NAME_FUEL_BASE = "fuel: base mass";
	public static final String GAUGE_NAME_FUEL_CHARGE_TEMP = "fuel: Estimated charge temperature";
	public static final String GAUGE_NAME_FUEL_CLT_CORR = "fuel: CLT correction";
	public static final String GAUGE_NAME_FUEL_CONSUMPTION = "fuel: Total consumed";
	public static final String GAUGE_NAME_FUEL_CRANKING = "fuel: cranking";
	public static final String GAUGE_NAME_FUEL_EL_EXTRA = "fuel: engine load acceleration extra fuel";
	public static final String GAUGE_NAME_FUEL_FLOW = "fuel: Flow rate";
	public static final String GAUGE_NAME_FUEL_IAT_CORR = "fuel: IAT correction";
	public static final String GAUGE_NAME_FUEL_INJ_DUTY = "fuel: injector duty cycle";
	public static final String GAUGE_NAME_FUEL_LAST_INJECTION = "fuel: Last injection";
	public static final String GAUGE_NAME_FUEL_LEVEL = "fuel level";
	public static final String GAUGE_NAME_FUEL_LOAD = "fuel: load";
	public static final String GAUGE_NAME_FUEL_PRESSURE_HIGH = "Fuel pressure (high)";
	public static final String GAUGE_NAME_FUEL_PRESSURE_HIGH_UNITS = "bar";
	public static final String GAUGE_NAME_FUEL_PRESSURE_LOW = "Fuel pressure (low)";
	public static final String GAUGE_NAME_FUEL_PRESSURE_LOW_UNITS = "kPa";
	public static final String GAUGE_NAME_FUEL_RUNNING = "fuel: running";
	public static final String GAUGE_NAME_FUEL_TPS_EXTRA = "fuel: TPS acceleration add fuel ms";
	public static final String GAUGE_NAME_FUEL_TPS_ROC = "fuel: TPS change";
	public static final String GAUGE_NAME_FUEL_TRIM = "fuel: fuel trim";
	public static final String GAUGE_NAME_FUEL_TRIM_2 = "fuel: fuel trim 2";
	public static final String GAUGE_NAME_FUEL_VE = "fuel: VE";
	public static final String GAUGE_NAME_FUEL_WALL_AMOUNT = "fuel: wall amount";
	public static final String GAUGE_NAME_FUEL_WALL_CORRECTION = "fuel: wall correction";
	public static final String GAUGE_NAME_FW_VERSION = "ECU Software Version";
	public static final String GAUGE_NAME_GEAR_RATIO = "Gearbox Ratio";
	public static final String GAUGE_NAME_IAC = "Idle Air Valve";
	public static final String GAUGE_NAME_IAT = "IAT";
	public static final String GAUGE_NAME_IDLE_POSITION = "Idle position sensor";
	public static final String GAUGE_NAME_IGNITION_LOAD = "ign: load";
	public static final String GAUGE_NAME_INJECTOR_LAG = "fuel: injector lag";
	public static final String GAUGE_NAME_ISS = "Input Shaft Speed";
	public static final String GAUGE_NAME_KNOCK_1 = "knock 1";
	public static final String GAUGE_NAME_KNOCK_10 = "knock 10";
	public static final String GAUGE_NAME_KNOCK_11 = "knock 11";
	public static final String GAUGE_NAME_KNOCK_12 = "knock 12";
	public static final String GAUGE_NAME_KNOCK_2 = "knock 2";
	public static final String GAUGE_NAME_KNOCK_3 = "knock 3";
	public static final String GAUGE_NAME_KNOCK_4 = "knock 4";
	public static final String GAUGE_NAME_KNOCK_5 = "knock 5";
	public static final String GAUGE_NAME_KNOCK_6 = "knock 6";
	public static final String GAUGE_NAME_KNOCK_7 = "knock 7";
	public static final String GAUGE_NAME_KNOCK_8 = "knock 8";
	public static final String GAUGE_NAME_KNOCK_9 = "knock 9";
	public static final String GAUGE_NAME_KNOCK_COUNTER = "knock: count";
	public static final String GAUGE_NAME_KNOCK_LEVEL = "knock: current level";
	public static final String GAUGE_NAME_KNOCK_RETARD = "knock: retard";
	public static final String GAUGE_NAME_LAMBDA = "Lambda";
	public static final String GAUGE_NAME_LAMBDA2 = "Lambda 2";
	public static final String GAUGE_NAME_LAST_ERROR = "Last error";
	public static final String GAUGE_NAME_MAF = "MAF";
	public static final String GAUGE_NAME_MAP = "MAP";
	public static final String GAUGE_NAME_OIL_PRESSURE = "Oil Pressure";
	public static final String GAUGE_NAME_OIL_PRESSURE_UNITS = "kPa";
	public static final String GAUGE_NAME_RAW_FUEL_PRESSURE_HIGH = "Fuel pressure raw (high)";
	public static final String GAUGE_NAME_RAW_FUEL_PRESSURE_LOW = "Fuel pressure raw (low)";
	public static final String GAUGE_NAME_RPM = "RPM";
	public static final String GAUGE_NAME_TARGET_AFR = "fuel: target AFR";
	public static final String GAUGE_NAME_TARGET_LAMBDA = "fuel: target lambda";
	public static final String GAUGE_NAME_TC_RATIO = "Torque Converter Ratio";
	public static final String GAUGE_NAME_TCHARGE = "fuel: SD tCharge";
	public static final String GAUGE_NAME_THROTTLE_PEDAL = "Throttle pedal position";
	public static final String GAUGE_NAME_TIME = "Time";
	public static final String GAUGE_NAME_TIMING_ADVANCE = "timing";
	public static final String GAUGE_NAME_TPS = "TPS";
	public static final String GAUGE_NAME_TPS2 = "TPS2";
	public static final String GAUGE_NAME_TRG_ERR = "Trigger Error Counter";
	public static final String GAUGE_NAME_TRG_GAP = "Trigger Sync Latest Ratio";
	public static final String GAUGE_NAME_TUNE_CRC16 = "Tune CRC16";
	public static final String GAUGE_NAME_TURBO_SPEED = "Turbocharger Speed";
	public static final String GAUGE_NAME_UPTIME = "Uptime";
	public static final String GAUGE_NAME_VBAT = "VBatt";
	public static final String GAUGE_NAME_VERSION = "firmware";
	public static final String GAUGE_NAME_VVS = "Vehicle Speed";
	public static final String GAUGE_NAME_VVT_B1E = "VVT: bank 1 exhaust";
	public static final String GAUGE_NAME_VVT_B1I = "VVT: bank 1 intake";
	public static final String GAUGE_NAME_VVT_B2E = "VVT: bank 2 exhaust";
	public static final String GAUGE_NAME_VVT_B2I = "VVT: bank 2 intake";
	public static final String GAUGE_NAME_VVT_TARGET_B1E = "VVT: bank 1 exhaust target";
	public static final String GAUGE_NAME_VVT_TARGET_B1I = "VVT: bank 1 intake target";
	public static final String GAUGE_NAME_VVT_TARGET_B2E = "VVT: bank 2 exhaust target";
	public static final String GAUGE_NAME_VVT_TARGET_B2I = "VVT: bank 2 intake target";
	public static final String GAUGE_NAME_WARNING_COUNT = "Warning count";
	public static final String GAUGE_NAME_WARNING_COUNTER = "warning: counter";
	public static final String GAUGE_NAME_WARNING_LAST = "warning: last";
	public static final String GAUGE_NAME_WG_POSITION = "Wastegate position sensor";
	public static final int GEARS_COUNT = 8;
	public static final int IGN_BLEND_COUNT = 4;
	public static final String INDICATOR_NAME_AC_SWITCH = "AC switch";
	public static final String INDICATOR_NAME_BRAKE_DOWN = "brake: down";
	public static final String INDICATOR_NAME_CLUTCH_DOWN = "clutch: down";
	public static final String INDICATOR_NAME_CLUTCH_UP = "clutch: up";
	public static final int LUA_ANALOG_INPUT_COUNT = 8;
	public static final int LUA_GAUGE_COUNT = 2;
	public static final int MAX_CYLINDER_COUNT = 12;
	public static final int PACK_ADD_TEMPERATURE = 40;
	public static final int PACK_MULT_AFR = 1000;
	public static final int PACK_MULT_AFR_CFG = 10;
	public static final int PACK_MULT_ANGLE = 50;
	public static final int PACK_MULT_FUEL_FLOW = 200;
	public static final int PACK_MULT_FUEL_MASS = 100;
	public static final int PACK_MULT_HIGH_PRESSURE = 10;
	public static final int PACK_MULT_LAMBDA = 10000;
	public static final int PACK_MULT_LAMBDA_CFG = 147;
	public static final int PACK_MULT_MASS_FLOW = 10;
	public static final int PACK_MULT_MS = 300;
	public static final int PACK_MULT_PERCENT = 100;
	public static final int PACK_MULT_PRESSURE = 30;
	public static final int PACK_MULT_TEMPERATURE = 100;
	public static final int PACK_MULT_VOLTAGE = 1000;
	public static final int PACK_MULT_VSS = 100;
	public static final int TPS_2_BYTE_PACKING_MULT = 100;
	public static final int VE_BLEND_COUNT = 4;
	public static final Field SD_PRESENT = Field.create("SD_PRESENT", 0, FieldType.BIT, 0).setBaseOffset(0);
	public static final Field SD_LOGGING_INTERNAL = Field.create("SD_LOGGING_INTERNAL", 0, FieldType.BIT, 1).setBaseOffset(0);
	public static final Field TRIGGERSCOPEREADY = Field.create("TRIGGERSCOPEREADY", 0, FieldType.BIT, 2).setBaseOffset(0);
	public static final Field ANTILAGTRIGGERED = Field.create("ANTILAGTRIGGERED", 0, FieldType.BIT, 3).setBaseOffset(0);
	public static final Field ISFANON = Field.create("ISFANON", 0, FieldType.BIT, 4).setBaseOffset(0);
	public static final Field ISO2HEATERON = Field.create("ISO2HEATERON", 0, FieldType.BIT, 5).setBaseOffset(0);
	public static final Field CHECKENGINE = Field.create("CHECKENGINE", 0, FieldType.BIT, 6).setBaseOffset(0);
	public static final Field NEEDBURN = Field.create("NEEDBURN", 0, FieldType.BIT, 7).setBaseOffset(0);
	public static final Field SD_MSD = Field.create("SD_MSD", 0, FieldType.BIT, 8).setBaseOffset(0);
	public static final Field ISFAN2ON = Field.create("ISFAN2ON", 0, FieldType.BIT, 9).setBaseOffset(0);
	public static final Field TOOTHLOGREADY = Field.create("TOOTHLOGREADY", 0, FieldType.BIT, 11).setBaseOffset(0);
	public static final Field ISTPSERROR = Field.create("ISTPSERROR", 0, FieldType.BIT, 13).setBaseOffset(0);
	public static final Field ISCLTERROR = Field.create("ISCLTERROR", 0, FieldType.BIT, 14).setBaseOffset(0);
	public static final Field ISMAPERROR = Field.create("ISMAPERROR", 0, FieldType.BIT, 15).setBaseOffset(0);
	public static final Field ISIATERROR = Field.create("ISIATERROR", 0, FieldType.BIT, 16).setBaseOffset(0);
	public static final Field ISTRIGGERERROR = Field.create("ISTRIGGERERROR", 0, FieldType.BIT, 18).setBaseOffset(0);
	public static final Field HASCRITICALERROR = Field.create("HASCRITICALERROR", 0, FieldType.BIT, 19).setBaseOffset(0);
	public static final Field ISWARNNOW = Field.create("ISWARNNOW", 0, FieldType.BIT, 20).setBaseOffset(0);
	public static final Field ISPEDALERROR = Field.create("ISPEDALERROR", 0, FieldType.BIT, 21).setBaseOffset(0);
	public static final Field ISKNOCKCHIPOK = Field.create("ISKNOCKCHIPOK", 0, FieldType.BIT, 22).setBaseOffset(0);
	public static final Field LAUNCHTRIGGERED = Field.create("LAUNCHTRIGGERED", 0, FieldType.BIT, 23).setBaseOffset(0);
	public static final Field ISTPS2ERROR = Field.create("ISTPS2ERROR", 0, FieldType.BIT, 24).setBaseOffset(0);
	public static final Field ISIDLECLOSEDLOOP = Field.create("ISIDLECLOSEDLOOP", 0, FieldType.BIT, 25).setBaseOffset(0);
	public static final Field RPMVALUE = Field.create("RPMVALUE", 4, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RPMACCELERATION = Field.create("RPMACCELERATION", 6, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field SPEEDTORPMRATIO = Field.create("SPEEDTORPMRATIO", 8, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field UNUSEDVEHICLESPEEDKPH = Field.create("UNUSEDVEHICLESPEEDKPH", 10, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field INTERNALMCUTEMPERATURE = Field.create("INTERNALMCUTEMPERATURE", 11, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field COOLANT = Field.create("COOLANT", 12, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field INTAKE = Field.create("INTAKE", 14, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field AUXTEMP1 = Field.create("AUXTEMP1", 16, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field AUXTEMP2 = Field.create("AUXTEMP2", 18, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TPSVALUE = Field.create("TPSVALUE", 20, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field THROTTLEPEDALPOSITION = Field.create("THROTTLEPEDALPOSITION", 22, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TPSADC = Field.create("TPSADC", 24, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RAWMAF = Field.create("RAWMAF", 26, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field MAFMEASURED = Field.create("MAFMEASURED", 28, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field MAPVALUE = Field.create("MAPVALUE", 30, FieldType.INT16).setScale(0.03333333333333333).setBaseOffset(0);
	public static final Field BAROPRESSURE = Field.create("BAROPRESSURE", 32, FieldType.INT16).setScale(0.03333333333333333).setBaseOffset(0);
	public static final Field LAMBDAVALUE = Field.create("LAMBDAVALUE", 34, FieldType.INT16).setScale(1.0E-4).setBaseOffset(0);
	public static final Field IDLECURRENTPOSITION = Field.create("IDLECURRENTPOSITION", 36, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field ALIGNMENTFILL_AT_37 = Field.create("ALIGNMENTFILL_AT_37", 37, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field VBATT = Field.create("VBATT", 38, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field OILPRESSURE = Field.create("OILPRESSURE", 40, FieldType.INT16).setScale(0.03333333333333333).setBaseOffset(0);
	public static final Field VVTPOSITIONB1I = Field.create("VVTPOSITIONB1I", 42, FieldType.INT16).setScale(0.02).setBaseOffset(0);
	public static final Field CHARGEAIRMASS = Field.create("CHARGEAIRMASS", 44, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field CRANKINGFUELMS = Field.create("CRANKINGFUELMS", 46, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field BASEFUEL = Field.create("BASEFUEL", 48, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field FUELRUNNING = Field.create("FUELRUNNING", 50, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ACTUALLASTINJECTION = Field.create("ACTUALLASTINJECTION", 52, FieldType.INT16).setScale(0.0033333333333333335).setBaseOffset(0);
	public static final Field INJECTORDUTYCYCLE = Field.create("INJECTORDUTYCYCLE", 54, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field VEVALUE = Field.create("VEVALUE", 55, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field INJECTIONOFFSET = Field.create("INJECTIONOFFSET", 56, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field TCHARGE = Field.create("TCHARGE", 58, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field INJECTORLAGMS = Field.create("INJECTORLAGMS", 60, FieldType.INT16).setScale(0.0033333333333333335).setBaseOffset(0);
	public static final Field ENGINEMAKECODENAMECRC16 = Field.create("ENGINEMAKECODENAMECRC16", 62, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field WALLFUELAMOUNT = Field.create("WALLFUELAMOUNT", 64, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field WALLFUELCORRECTIONVALUE = Field.create("WALLFUELCORRECTIONVALUE", 66, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field REVOLUTIONCOUNTERSINCESTART = Field.create("REVOLUTIONCOUNTERSINCESTART", 68, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field DELTATPSVALUE = Field.create("DELTATPSVALUE", 70, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field CANREADCOUNTER = Field.create("CANREADCOUNTER", 72, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field TPSACCELFUEL = Field.create("TPSACCELFUEL", 74, FieldType.INT16).setScale(0.0033333333333333335).setBaseOffset(0);
	public static final Field WARNINGCOUNTER = Field.create("WARNINGCOUNTER", 76, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field LASTERRORCODE = Field.create("LASTERRORCODE", 78, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field COILDUTYCYCLE = Field.create("COILDUTYCYCLE", 80, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IDLEAIRVALVEPOSITION = Field.create("IDLEAIRVALVEPOSITION", 82, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETBTARGET = Field.create("ETBTARGET", 84, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETB1DUTYCYCLE = Field.create("ETB1DUTYCYCLE", 86, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field FUELTANKLEVEL = Field.create("FUELTANKLEVEL", 88, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TOTALFUELCONSUMPTION = Field.create("TOTALFUELCONSUMPTION", 90, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field FUELFLOWRATE = Field.create("FUELFLOWRATE", 92, FieldType.INT16).setScale(0.005).setBaseOffset(0);
	public static final Field TPS2VALUE = Field.create("TPS2VALUE", 94, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TUNECRC16 = Field.create("TUNECRC16", 96, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field ALIGNMENTFILL_AT_98 = Field.create("ALIGNMENTFILL_AT_98", 98, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCKLEVEL = Field.create("KNOCKLEVEL", 100, FieldType.FLOAT).setBaseOffset(0);
	public static final Field SECONDS = Field.create("SECONDS", 104, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field ENGINEMODE = Field.create("ENGINEMODE", 108, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field FIRMWAREVERSION = Field.create("FIRMWAREVERSION", 112, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field RAWIDLEPOSITIONSENSOR = Field.create("RAWIDLEPOSITIONSENSOR", 116, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWWASTEGATEPOSITION = Field.create("RAWWASTEGATEPOSITION", 118, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field ACCELERATIONX = Field.create("ACCELERATIONX", 120, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ACCELERATIONY = Field.create("ACCELERATIONY", 122, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TSCONFIGVERSION = Field.create("TSCONFIGVERSION", 124, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field CALIBRATIONVALUE = Field.create("CALIBRATIONVALUE", 128, FieldType.FLOAT).setBaseOffset(0);
	public static final Field CALIBRATIONMODE = Field.create("CALIBRATIONMODE", 132, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field IDLETARGETPOSITION = Field.create("IDLETARGETPOSITION", 133, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field DETECTEDGEAR = Field.create("DETECTEDGEAR", 134, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field MAXTRIGGERREENTRANT = Field.create("MAXTRIGGERREENTRANT", 135, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TOTALTRIGGERERRORCOUNTER = Field.create("TOTALTRIGGERERRORCOUNTER", 136, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field ORDERINGERRORCOUNTER = Field.create("ORDERINGERRORCOUNTER", 140, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE1 = Field.create("RECENTERRORCODE1", 144, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE2 = Field.create("RECENTERRORCODE2", 146, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE3 = Field.create("RECENTERRORCODE3", 148, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE4 = Field.create("RECENTERRORCODE4", 150, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE5 = Field.create("RECENTERRORCODE5", 152, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE6 = Field.create("RECENTERRORCODE6", 154, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE7 = Field.create("RECENTERRORCODE7", 156, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE8 = Field.create("RECENTERRORCODE8", 158, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD1 = Field.create("DEBUGFLOATFIELD1", 160, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD2 = Field.create("DEBUGFLOATFIELD2", 164, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD3 = Field.create("DEBUGFLOATFIELD3", 168, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD4 = Field.create("DEBUGFLOATFIELD4", 172, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD5 = Field.create("DEBUGFLOATFIELD5", 176, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD6 = Field.create("DEBUGFLOATFIELD6", 180, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD7 = Field.create("DEBUGFLOATFIELD7", 184, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGINTFIELD1 = Field.create("DEBUGINTFIELD1", 188, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field DEBUGINTFIELD2 = Field.create("DEBUGINTFIELD2", 192, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field DEBUGINTFIELD3 = Field.create("DEBUGINTFIELD3", 196, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field DEBUGINTFIELD4 = Field.create("DEBUGINTFIELD4", 200, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field DEBUGINTFIELD5 = Field.create("DEBUGINTFIELD5", 202, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT1 = Field.create("EGT1", 204, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT2 = Field.create("EGT2", 206, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT3 = Field.create("EGT3", 208, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT4 = Field.create("EGT4", 210, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT5 = Field.create("EGT5", 212, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT6 = Field.create("EGT6", 214, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT7 = Field.create("EGT7", 216, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT8 = Field.create("EGT8", 218, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RAWTPS1PRIMARY = Field.create("RAWTPS1PRIMARY", 220, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWPPSPRIMARY = Field.create("RAWPPSPRIMARY", 222, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWCLT = Field.create("RAWCLT", 224, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWIAT = Field.create("RAWIAT", 226, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWOILPRESSURE = Field.create("RAWOILPRESSURE", 228, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field FUELCLOSEDLOOPBINIDX = Field.create("FUELCLOSEDLOOPBINIDX", 230, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TCUCURRENTGEAR = Field.create("TCUCURRENTGEAR", 231, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field RAWPPSSECONDARY = Field.create("RAWPPSSECONDARY", 232, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field KNOCK1 = Field.create("KNOCK1", 234, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK2 = Field.create("KNOCK2", 235, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK3 = Field.create("KNOCK3", 236, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK4 = Field.create("KNOCK4", 237, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK5 = Field.create("KNOCK5", 238, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK6 = Field.create("KNOCK6", 239, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK7 = Field.create("KNOCK7", 240, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK8 = Field.create("KNOCK8", 241, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK9 = Field.create("KNOCK9", 242, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK10 = Field.create("KNOCK10", 243, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK11 = Field.create("KNOCK11", 244, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK12 = Field.create("KNOCK12", 245, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TCUDESIREDGEAR = Field.create("TCUDESIREDGEAR", 246, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field FLEXPERCENT = Field.create("FLEXPERCENT", 247, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field WASTEGATEPOSITIONSENSOR = Field.create("WASTEGATEPOSITIONSENSOR", 248, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IDLEPOSITIONSENSOR = Field.create("IDLEPOSITIONSENSOR", 250, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field RAWLOWFUELPRESSURE = Field.create("RAWLOWFUELPRESSURE", 252, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWHIGHFUELPRESSURE = Field.create("RAWHIGHFUELPRESSURE", 254, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field LOWFUELPRESSURE = Field.create("LOWFUELPRESSURE", 256, FieldType.INT16).setScale(0.03333333333333333).setBaseOffset(0);
	public static final Field HIGHFUELPRESSURE = Field.create("HIGHFUELPRESSURE", 258, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field AFRVALUE = Field.create("AFRVALUE", 260, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field VSSACCELERATION = Field.create("VSSACCELERATION", 262, FieldType.INT16).setScale(0.0033333333333333335).setBaseOffset(0);
	public static final Field LAMBDAVALUE2 = Field.create("LAMBDAVALUE2", 264, FieldType.INT16).setScale(1.0E-4).setBaseOffset(0);
	public static final Field AFRVALUE2 = Field.create("AFRVALUE2", 266, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field VVTPOSITIONB1E = Field.create("VVTPOSITIONB1E", 268, FieldType.INT16).setScale(0.02).setBaseOffset(0);
	public static final Field VVTPOSITIONB2I = Field.create("VVTPOSITIONB2I", 270, FieldType.INT16).setScale(0.02).setBaseOffset(0);
	public static final Field VVTPOSITIONB2E = Field.create("VVTPOSITIONB2E", 272, FieldType.INT16).setScale(0.02).setBaseOffset(0);
	public static final Field FUELPIDCORRECTION1 = Field.create("FUELPIDCORRECTION1", 274, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field FUELPIDCORRECTION2 = Field.create("FUELPIDCORRECTION2", 276, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field RAWTPS1SECONDARY = Field.create("RAWTPS1SECONDARY", 278, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWTPS2PRIMARY = Field.create("RAWTPS2PRIMARY", 280, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWTPS2SECONDARY = Field.create("RAWTPS2SECONDARY", 282, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field ACCELERATIONZ = Field.create("ACCELERATIONZ", 284, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ACCELERATIONROLL = Field.create("ACCELERATIONROLL", 286, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ACCELERATIONYAW = Field.create("ACCELERATIONYAW", 288, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTTARGETS1 = Field.create("VVTTARGETS1", 290, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field VVTTARGETS2 = Field.create("VVTTARGETS2", 291, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field VVTTARGETS3 = Field.create("VVTTARGETS3", 292, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field VVTTARGETS4 = Field.create("VVTTARGETS4", 293, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TURBOSPEED = Field.create("TURBOSPEED", 294, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field TPS1SPLIT = Field.create("TPS1SPLIT", 296, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TPS2SPLIT = Field.create("TPS2SPLIT", 298, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TPS12SPLIT = Field.create("TPS12SPLIT", 300, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ACCPEDALSPLIT = Field.create("ACCPEDALSPLIT", 302, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field SPARKCUTREASON = Field.create("SPARKCUTREASON", 304, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field FUELCUTREASON = Field.create("FUELCUTREASON", 305, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field MAFESTIMATE = Field.create("MAFESTIMATE", 306, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field INSTANTRPM = Field.create("INSTANTRPM", 308, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field SYSTEMEVENTREUSE = Field.create("SYSTEMEVENTREUSE", 310, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RAWMAP = Field.create("RAWMAP", 312, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWAFR = Field.create("RAWAFR", 314, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field TPSACCELFROM = Field.create("TPSACCELFROM", 316, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TPSACCELTO = Field.create("TPSACCELTO", 317, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field ALIGNMENTFILL_AT_318 = Field.create("ALIGNMENTFILL_AT_318", 318, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field CALIBRATIONVALUE2 = Field.create("CALIBRATIONVALUE2", 320, FieldType.FLOAT).setBaseOffset(0);
	public static final Field ISMAINRELAYON = Field.create("ISMAINRELAYON", 324, FieldType.BIT, 0).setBaseOffset(0);
	public static final Field ISUSBCONNECTED = Field.create("ISUSBCONNECTED", 324, FieldType.BIT, 1).setBaseOffset(0);
	public static final Field LUAINVOCATIONCOUNTER = Field.create("LUAINVOCATIONCOUNTER", 328, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field LUALASTCYCLEDURATION = Field.create("LUALASTCYCLEDURATION", 332, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field TESTBENCHITER = Field.create("TESTBENCHITER", 336, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TCU_CURRENTRANGE = Field.create("TCU_CURRENTRANGE", 337, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TCRATIO = Field.create("TCRATIO", 338, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field LASTSHIFTTIME = Field.create("LASTSHIFTTIME", 340, FieldType.FLOAT).setBaseOffset(0);
	public static final Field VSSEDGECOUNTER = Field.create("VSSEDGECOUNTER", 344, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field ISSEDGECOUNTER = Field.create("ISSEDGECOUNTER", 348, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field AUXLINEAR1 = Field.create("AUXLINEAR1", 352, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field AUXLINEAR2 = Field.create("AUXLINEAR2", 354, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field DFCOACTIVE = Field.create("DFCOACTIVE", 356, FieldType.BIT, 0).setBaseOffset(0);
	public static final Field TPSACCELACTIVE = Field.create("TPSACCELACTIVE", 356, FieldType.BIT, 1).setBaseOffset(0);
	public static final Field FALLBACKMAP = Field.create("FALLBACKMAP", 360, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field INSTANTMAPVALUE = Field.create("INSTANTMAPVALUE", 362, FieldType.INT16).setScale(0.03333333333333333).setBaseOffset(0);
	public static final Field MAXLOCKEDDURATION = Field.create("MAXLOCKEDDURATION", 364, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field CANWRITEOK = Field.create("CANWRITEOK", 366, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field CANWRITENOTOK = Field.create("CANWRITENOTOK", 368, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field ALIGNMENTFILL_AT_370 = Field.create("ALIGNMENTFILL_AT_370", 370, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERPRIMARYFALL = Field.create("TRIGGERPRIMARYFALL", 372, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERPRIMARYRISE = Field.create("TRIGGERPRIMARYRISE", 376, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERSECONDARYFALL = Field.create("TRIGGERSECONDARYFALL", 380, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERSECONDARYRISE = Field.create("TRIGGERSECONDARYRISE", 384, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERVVTFALL = Field.create("TRIGGERVVTFALL", 388, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERVVTRISE = Field.create("TRIGGERVVTRISE", 390, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERVVT2FALL = Field.create("TRIGGERVVT2FALL", 392, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERVVT2RISE = Field.create("TRIGGERVVT2RISE", 394, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field STARTERSTATE = Field.create("STARTERSTATE", 396, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field STARTERRELAYDISABLE = Field.create("STARTERRELAYDISABLE", 397, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field MULTISPARKCOUNTER = Field.create("MULTISPARKCOUNTER", 398, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field EXTIOVERFLOWCOUNT = Field.create("EXTIOVERFLOWCOUNT", 399, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_PTERM = Field.create("ALTERNATORSTATUS_PTERM", 400, FieldType.FLOAT).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_ITERM = Field.create("ALTERNATORSTATUS_ITERM", 404, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_DTERM = Field.create("ALTERNATORSTATUS_DTERM", 406, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_OUTPUT = Field.create("ALTERNATORSTATUS_OUTPUT", 408, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_ERROR = Field.create("ALTERNATORSTATUS_ERROR", 410, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_RESETCOUNTER = Field.create("ALTERNATORSTATUS_RESETCOUNTER", 412, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field IDLESTATUS_PTERM = Field.create("IDLESTATUS_PTERM", 416, FieldType.FLOAT).setBaseOffset(0);
	public static final Field IDLESTATUS_ITERM = Field.create("IDLESTATUS_ITERM", 420, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IDLESTATUS_DTERM = Field.create("IDLESTATUS_DTERM", 422, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IDLESTATUS_OUTPUT = Field.create("IDLESTATUS_OUTPUT", 424, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IDLESTATUS_ERROR = Field.create("IDLESTATUS_ERROR", 426, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IDLESTATUS_RESETCOUNTER = Field.create("IDLESTATUS_RESETCOUNTER", 428, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field ETBSTATUS_PTERM = Field.create("ETBSTATUS_PTERM", 432, FieldType.FLOAT).setBaseOffset(0);
	public static final Field ETBSTATUS_ITERM = Field.create("ETBSTATUS_ITERM", 436, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETBSTATUS_DTERM = Field.create("ETBSTATUS_DTERM", 438, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETBSTATUS_OUTPUT = Field.create("ETBSTATUS_OUTPUT", 440, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETBSTATUS_ERROR = Field.create("ETBSTATUS_ERROR", 442, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETBSTATUS_RESETCOUNTER = Field.create("ETBSTATUS_RESETCOUNTER", 444, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field BOOSTSTATUS_PTERM = Field.create("BOOSTSTATUS_PTERM", 448, FieldType.FLOAT).setBaseOffset(0);
	public static final Field BOOSTSTATUS_ITERM = Field.create("BOOSTSTATUS_ITERM", 452, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field BOOSTSTATUS_DTERM = Field.create("BOOSTSTATUS_DTERM", 454, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field BOOSTSTATUS_OUTPUT = Field.create("BOOSTSTATUS_OUTPUT", 456, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field BOOSTSTATUS_ERROR = Field.create("BOOSTSTATUS_ERROR", 458, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field BOOSTSTATUS_RESETCOUNTER = Field.create("BOOSTSTATUS_RESETCOUNTER", 460, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_PTERM = Field.create("WASTEGATEDCSTATUS_PTERM", 464, FieldType.FLOAT).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_ITERM = Field.create("WASTEGATEDCSTATUS_ITERM", 468, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_DTERM = Field.create("WASTEGATEDCSTATUS_DTERM", 470, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_OUTPUT = Field.create("WASTEGATEDCSTATUS_OUTPUT", 472, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_ERROR = Field.create("WASTEGATEDCSTATUS_ERROR", 474, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_RESETCOUNTER = Field.create("WASTEGATEDCSTATUS_RESETCOUNTER", 476, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field VVTSTATUS1_PTERM = Field.create("VVTSTATUS1_PTERM", 480, FieldType.FLOAT).setBaseOffset(0);
	public static final Field VVTSTATUS1_ITERM = Field.create("VVTSTATUS1_ITERM", 484, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS1_DTERM = Field.create("VVTSTATUS1_DTERM", 486, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS1_OUTPUT = Field.create("VVTSTATUS1_OUTPUT", 488, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS1_ERROR = Field.create("VVTSTATUS1_ERROR", 490, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS1_RESETCOUNTER = Field.create("VVTSTATUS1_RESETCOUNTER", 492, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field VVTSTATUS2_PTERM = Field.create("VVTSTATUS2_PTERM", 496, FieldType.FLOAT).setBaseOffset(0);
	public static final Field VVTSTATUS2_ITERM = Field.create("VVTSTATUS2_ITERM", 500, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS2_DTERM = Field.create("VVTSTATUS2_DTERM", 502, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS2_OUTPUT = Field.create("VVTSTATUS2_OUTPUT", 504, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS2_ERROR = Field.create("VVTSTATUS2_ERROR", 506, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS2_RESETCOUNTER = Field.create("VVTSTATUS2_RESETCOUNTER", 508, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field VVTSTATUS3_PTERM = Field.create("VVTSTATUS3_PTERM", 512, FieldType.FLOAT).setBaseOffset(0);
	public static final Field VVTSTATUS3_ITERM = Field.create("VVTSTATUS3_ITERM", 516, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS3_DTERM = Field.create("VVTSTATUS3_DTERM", 518, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS3_OUTPUT = Field.create("VVTSTATUS3_OUTPUT", 520, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS3_ERROR = Field.create("VVTSTATUS3_ERROR", 522, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS3_RESETCOUNTER = Field.create("VVTSTATUS3_RESETCOUNTER", 524, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field VVTSTATUS4_PTERM = Field.create("VVTSTATUS4_PTERM", 528, FieldType.FLOAT).setBaseOffset(0);
	public static final Field VVTSTATUS4_ITERM = Field.create("VVTSTATUS4_ITERM", 532, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS4_DTERM = Field.create("VVTSTATUS4_DTERM", 534, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS4_OUTPUT = Field.create("VVTSTATUS4_OUTPUT", 536, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS4_ERROR = Field.create("VVTSTATUS4_ERROR", 538, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS4_RESETCOUNTER = Field.create("VVTSTATUS4_RESETCOUNTER", 540, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field AUXSPEED1 = Field.create("AUXSPEED1", 544, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field AUXSPEED2 = Field.create("AUXSPEED2", 546, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field ISSVALUE = Field.create("ISSVALUE", 548, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RAWANALOGINPUT1 = Field.create("RAWANALOGINPUT1", 550, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT2 = Field.create("RAWANALOGINPUT2", 552, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT3 = Field.create("RAWANALOGINPUT3", 554, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT4 = Field.create("RAWANALOGINPUT4", 556, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT5 = Field.create("RAWANALOGINPUT5", 558, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT6 = Field.create("RAWANALOGINPUT6", 560, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT7 = Field.create("RAWANALOGINPUT7", 562, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT8 = Field.create("RAWANALOGINPUT8", 564, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field GPPWMOUTPUT1 = Field.create("GPPWMOUTPUT1", 566, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field GPPWMOUTPUT2 = Field.create("GPPWMOUTPUT2", 567, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field GPPWMOUTPUT3 = Field.create("GPPWMOUTPUT3", 568, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field GPPWMOUTPUT4 = Field.create("GPPWMOUTPUT4", 569, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field GPPWMXAXIS1 = Field.create("GPPWMXAXIS1", 570, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field GPPWMXAXIS2 = Field.create("GPPWMXAXIS2", 572, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field GPPWMXAXIS3 = Field.create("GPPWMXAXIS3", 574, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field GPPWMXAXIS4 = Field.create("GPPWMXAXIS4", 576, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field GPPWMYAXIS1 = Field.create("GPPWMYAXIS1", 578, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field GPPWMYAXIS2 = Field.create("GPPWMYAXIS2", 580, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field GPPWMYAXIS3 = Field.create("GPPWMYAXIS3", 582, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field GPPWMYAXIS4 = Field.create("GPPWMYAXIS4", 584, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field RAWBATTERY = Field.create("RAWBATTERY", 586, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field IGNBLENDPARAMETER1 = Field.create("IGNBLENDPARAMETER1", 588, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field IGNBLENDPARAMETER2 = Field.create("IGNBLENDPARAMETER2", 590, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field IGNBLENDPARAMETER3 = Field.create("IGNBLENDPARAMETER3", 592, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field IGNBLENDPARAMETER4 = Field.create("IGNBLENDPARAMETER4", 594, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field IGNBLENDBIAS1 = Field.create("IGNBLENDBIAS1", 596, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field IGNBLENDBIAS2 = Field.create("IGNBLENDBIAS2", 597, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field IGNBLENDBIAS3 = Field.create("IGNBLENDBIAS3", 598, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field IGNBLENDBIAS4 = Field.create("IGNBLENDBIAS4", 599, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field IGNBLENDOUTPUT1 = Field.create("IGNBLENDOUTPUT1", 600, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IGNBLENDOUTPUT2 = Field.create("IGNBLENDOUTPUT2", 602, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IGNBLENDOUTPUT3 = Field.create("IGNBLENDOUTPUT3", 604, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IGNBLENDOUTPUT4 = Field.create("IGNBLENDOUTPUT4", 606, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VEBLENDPARAMETER1 = Field.create("VEBLENDPARAMETER1", 608, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field VEBLENDPARAMETER2 = Field.create("VEBLENDPARAMETER2", 610, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field VEBLENDPARAMETER3 = Field.create("VEBLENDPARAMETER3", 612, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field VEBLENDPARAMETER4 = Field.create("VEBLENDPARAMETER4", 614, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field VEBLENDBIAS1 = Field.create("VEBLENDBIAS1", 616, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field VEBLENDBIAS2 = Field.create("VEBLENDBIAS2", 617, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field VEBLENDBIAS3 = Field.create("VEBLENDBIAS3", 618, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field VEBLENDBIAS4 = Field.create("VEBLENDBIAS4", 619, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field VEBLENDOUTPUT1 = Field.create("VEBLENDOUTPUT1", 620, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VEBLENDOUTPUT2 = Field.create("VEBLENDOUTPUT2", 622, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VEBLENDOUTPUT3 = Field.create("VEBLENDOUTPUT3", 624, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VEBLENDOUTPUT4 = Field.create("VEBLENDOUTPUT4", 626, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDPARAMETER1 = Field.create("BOOSTOPENLOOPBLENDPARAMETER1", 628, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDPARAMETER2 = Field.create("BOOSTOPENLOOPBLENDPARAMETER2", 630, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDBIAS1 = Field.create("BOOSTOPENLOOPBLENDBIAS1", 632, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDBIAS2 = Field.create("BOOSTOPENLOOPBLENDBIAS2", 633, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDOUTPUT1 = Field.create("BOOSTOPENLOOPBLENDOUTPUT1", 634, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDOUTPUT2 = Field.create("BOOSTOPENLOOPBLENDOUTPUT2", 635, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDPARAMETER1 = Field.create("BOOSTCLOSEDLOOPBLENDPARAMETER1", 636, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDPARAMETER2 = Field.create("BOOSTCLOSEDLOOPBLENDPARAMETER2", 638, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDBIAS1 = Field.create("BOOSTCLOSEDLOOPBLENDBIAS1", 640, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDBIAS2 = Field.create("BOOSTCLOSEDLOOPBLENDBIAS2", 641, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDOUTPUT1 = Field.create("BOOSTCLOSEDLOOPBLENDOUTPUT1", 642, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDOUTPUT2 = Field.create("BOOSTCLOSEDLOOPBLENDOUTPUT2", 644, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field ALIGNMENTFILL_AT_646 = Field.create("ALIGNMENTFILL_AT_646", 646, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field COILSTATE1 = Field.create("COILSTATE1", 648, FieldType.BIT, 0).setBaseOffset(0);
	public static final Field COILSTATE2 = Field.create("COILSTATE2", 648, FieldType.BIT, 1).setBaseOffset(0);
	public static final Field COILSTATE3 = Field.create("COILSTATE3", 648, FieldType.BIT, 2).setBaseOffset(0);
	public static final Field COILSTATE4 = Field.create("COILSTATE4", 648, FieldType.BIT, 3).setBaseOffset(0);
	public static final Field COILSTATE5 = Field.create("COILSTATE5", 648, FieldType.BIT, 4).setBaseOffset(0);
	public static final Field COILSTATE6 = Field.create("COILSTATE6", 648, FieldType.BIT, 5).setBaseOffset(0);
	public static final Field COILSTATE7 = Field.create("COILSTATE7", 648, FieldType.BIT, 6).setBaseOffset(0);
	public static final Field COILSTATE8 = Field.create("COILSTATE8", 648, FieldType.BIT, 7).setBaseOffset(0);
	public static final Field COILSTATE9 = Field.create("COILSTATE9", 648, FieldType.BIT, 8).setBaseOffset(0);
	public static final Field COILSTATE10 = Field.create("COILSTATE10", 648, FieldType.BIT, 9).setBaseOffset(0);
	public static final Field COILSTATE11 = Field.create("COILSTATE11", 648, FieldType.BIT, 10).setBaseOffset(0);
	public static final Field COILSTATE12 = Field.create("COILSTATE12", 648, FieldType.BIT, 11).setBaseOffset(0);
	public static final Field INJECTORSTATE1 = Field.create("INJECTORSTATE1", 648, FieldType.BIT, 12).setBaseOffset(0);
	public static final Field INJECTORSTATE2 = Field.create("INJECTORSTATE2", 648, FieldType.BIT, 13).setBaseOffset(0);
	public static final Field INJECTORSTATE3 = Field.create("INJECTORSTATE3", 648, FieldType.BIT, 14).setBaseOffset(0);
	public static final Field INJECTORSTATE4 = Field.create("INJECTORSTATE4", 648, FieldType.BIT, 15).setBaseOffset(0);
	public static final Field INJECTORSTATE5 = Field.create("INJECTORSTATE5", 648, FieldType.BIT, 16).setBaseOffset(0);
	public static final Field INJECTORSTATE6 = Field.create("INJECTORSTATE6", 648, FieldType.BIT, 17).setBaseOffset(0);
	public static final Field INJECTORSTATE7 = Field.create("INJECTORSTATE7", 648, FieldType.BIT, 18).setBaseOffset(0);
	public static final Field INJECTORSTATE8 = Field.create("INJECTORSTATE8", 648, FieldType.BIT, 19).setBaseOffset(0);
	public static final Field INJECTORSTATE9 = Field.create("INJECTORSTATE9", 648, FieldType.BIT, 20).setBaseOffset(0);
	public static final Field INJECTORSTATE10 = Field.create("INJECTORSTATE10", 648, FieldType.BIT, 21).setBaseOffset(0);
	public static final Field INJECTORSTATE11 = Field.create("INJECTORSTATE11", 648, FieldType.BIT, 22).setBaseOffset(0);
	public static final Field INJECTORSTATE12 = Field.create("INJECTORSTATE12", 648, FieldType.BIT, 23).setBaseOffset(0);
	public static final Field TRIGGERCHANNEL1 = Field.create("TRIGGERCHANNEL1", 648, FieldType.BIT, 24).setBaseOffset(0);
	public static final Field TRIGGERCHANNEL2 = Field.create("TRIGGERCHANNEL2", 648, FieldType.BIT, 25).setBaseOffset(0);
	public static final Field VVTCHANNEL1 = Field.create("VVTCHANNEL1", 648, FieldType.BIT, 26).setBaseOffset(0);
	public static final Field VVTCHANNEL2 = Field.create("VVTCHANNEL2", 648, FieldType.BIT, 27).setBaseOffset(0);
	public static final Field VVTCHANNEL3 = Field.create("VVTCHANNEL3", 648, FieldType.BIT, 28).setBaseOffset(0);
	public static final Field VVTCHANNEL4 = Field.create("VVTCHANNEL4", 648, FieldType.BIT, 29).setBaseOffset(0);
	public static final Field OUTPUTREQUESTPERIOD = Field.create("OUTPUTREQUESTPERIOD", 652, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field MAPFAST = Field.create("MAPFAST", 656, FieldType.FLOAT).setBaseOffset(0);
	public static final Field LUAGAUGES1 = Field.create("LUAGAUGES1", 660, FieldType.FLOAT).setBaseOffset(0);
	public static final Field LUAGAUGES2 = Field.create("LUAGAUGES2", 664, FieldType.FLOAT).setBaseOffset(0);
	public static final Field RAWMAF2 = Field.create("RAWMAF2", 668, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field MAFMEASURED2 = Field.create("MAFMEASURED2", 670, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field SCHEDULINGUSEDCOUNT = Field.create("SCHEDULINGUSEDCOUNT", 672, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field VEHICLESPEEDKPH = Field.create("VEHICLESPEEDKPH", 674, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND1 = Field.create("UNUSEDATTHEEND1", 676, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND2 = Field.create("UNUSEDATTHEEND2", 677, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND3 = Field.create("UNUSEDATTHEEND3", 678, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND4 = Field.create("UNUSEDATTHEEND4", 679, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND5 = Field.create("UNUSEDATTHEEND5", 680, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND6 = Field.create("UNUSEDATTHEEND6", 681, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND7 = Field.create("UNUSEDATTHEEND7", 682, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND8 = Field.create("UNUSEDATTHEEND8", 683, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND9 = Field.create("UNUSEDATTHEEND9", 684, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND10 = Field.create("UNUSEDATTHEEND10", 685, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND11 = Field.create("UNUSEDATTHEEND11", 686, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND12 = Field.create("UNUSEDATTHEEND12", 687, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND13 = Field.create("UNUSEDATTHEEND13", 688, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND14 = Field.create("UNUSEDATTHEEND14", 689, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND15 = Field.create("UNUSEDATTHEEND15", 690, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND16 = Field.create("UNUSEDATTHEEND16", 691, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND17 = Field.create("UNUSEDATTHEEND17", 692, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND18 = Field.create("UNUSEDATTHEEND18", 693, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND19 = Field.create("UNUSEDATTHEEND19", 694, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND20 = Field.create("UNUSEDATTHEEND20", 695, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND21 = Field.create("UNUSEDATTHEEND21", 696, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND22 = Field.create("UNUSEDATTHEEND22", 697, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND23 = Field.create("UNUSEDATTHEEND23", 698, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND24 = Field.create("UNUSEDATTHEEND24", 699, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND25 = Field.create("UNUSEDATTHEEND25", 700, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND26 = Field.create("UNUSEDATTHEEND26", 701, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND27 = Field.create("UNUSEDATTHEEND27", 702, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND28 = Field.create("UNUSEDATTHEEND28", 703, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND29 = Field.create("UNUSEDATTHEEND29", 704, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND30 = Field.create("UNUSEDATTHEEND30", 705, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND31 = Field.create("UNUSEDATTHEEND31", 706, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND32 = Field.create("UNUSEDATTHEEND32", 707, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND33 = Field.create("UNUSEDATTHEEND33", 708, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND34 = Field.create("UNUSEDATTHEEND34", 709, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND35 = Field.create("UNUSEDATTHEEND35", 710, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND36 = Field.create("UNUSEDATTHEEND36", 711, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND37 = Field.create("UNUSEDATTHEEND37", 712, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND38 = Field.create("UNUSEDATTHEEND38", 713, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND39 = Field.create("UNUSEDATTHEEND39", 714, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND40 = Field.create("UNUSEDATTHEEND40", 715, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND41 = Field.create("UNUSEDATTHEEND41", 716, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND42 = Field.create("UNUSEDATTHEEND42", 717, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND43 = Field.create("UNUSEDATTHEEND43", 718, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND44 = Field.create("UNUSEDATTHEEND44", 719, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND45 = Field.create("UNUSEDATTHEEND45", 720, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND46 = Field.create("UNUSEDATTHEEND46", 721, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND47 = Field.create("UNUSEDATTHEEND47", 722, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND48 = Field.create("UNUSEDATTHEEND48", 723, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND49 = Field.create("UNUSEDATTHEEND49", 724, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND50 = Field.create("UNUSEDATTHEEND50", 725, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND51 = Field.create("UNUSEDATTHEEND51", 726, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND52 = Field.create("UNUSEDATTHEEND52", 727, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND53 = Field.create("UNUSEDATTHEEND53", 728, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND54 = Field.create("UNUSEDATTHEEND54", 729, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND55 = Field.create("UNUSEDATTHEEND55", 730, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND56 = Field.create("UNUSEDATTHEEND56", 731, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND57 = Field.create("UNUSEDATTHEEND57", 732, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND58 = Field.create("UNUSEDATTHEEND58", 733, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND59 = Field.create("UNUSEDATTHEEND59", 734, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND60 = Field.create("UNUSEDATTHEEND60", 735, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND61 = Field.create("UNUSEDATTHEEND61", 736, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND62 = Field.create("UNUSEDATTHEEND62", 737, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND63 = Field.create("UNUSEDATTHEEND63", 738, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND64 = Field.create("UNUSEDATTHEEND64", 739, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND65 = Field.create("UNUSEDATTHEEND65", 740, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND66 = Field.create("UNUSEDATTHEEND66", 741, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND67 = Field.create("UNUSEDATTHEEND67", 742, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND68 = Field.create("UNUSEDATTHEEND68", 743, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND69 = Field.create("UNUSEDATTHEEND69", 744, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND70 = Field.create("UNUSEDATTHEEND70", 745, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND71 = Field.create("UNUSEDATTHEEND71", 746, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND72 = Field.create("UNUSEDATTHEEND72", 747, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND73 = Field.create("UNUSEDATTHEEND73", 748, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND74 = Field.create("UNUSEDATTHEEND74", 749, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND75 = Field.create("UNUSEDATTHEEND75", 750, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND76 = Field.create("UNUSEDATTHEEND76", 751, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND77 = Field.create("UNUSEDATTHEEND77", 752, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND78 = Field.create("UNUSEDATTHEEND78", 753, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND79 = Field.create("UNUSEDATTHEEND79", 754, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND80 = Field.create("UNUSEDATTHEEND80", 755, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND81 = Field.create("UNUSEDATTHEEND81", 756, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND82 = Field.create("UNUSEDATTHEEND82", 757, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND83 = Field.create("UNUSEDATTHEEND83", 758, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND84 = Field.create("UNUSEDATTHEEND84", 759, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND85 = Field.create("UNUSEDATTHEEND85", 760, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND86 = Field.create("UNUSEDATTHEEND86", 761, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND87 = Field.create("UNUSEDATTHEEND87", 762, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND88 = Field.create("UNUSEDATTHEEND88", 763, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND89 = Field.create("UNUSEDATTHEEND89", 764, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND90 = Field.create("UNUSEDATTHEEND90", 765, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND91 = Field.create("UNUSEDATTHEEND91", 766, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND92 = Field.create("UNUSEDATTHEEND92", 767, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND93 = Field.create("UNUSEDATTHEEND93", 768, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND94 = Field.create("UNUSEDATTHEEND94", 769, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND95 = Field.create("UNUSEDATTHEEND95", 770, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND96 = Field.create("UNUSEDATTHEEND96", 771, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND97 = Field.create("UNUSEDATTHEEND97", 772, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND98 = Field.create("UNUSEDATTHEEND98", 773, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND99 = Field.create("UNUSEDATTHEEND99", 774, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND100 = Field.create("UNUSEDATTHEEND100", 775, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND101 = Field.create("UNUSEDATTHEEND101", 776, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND102 = Field.create("UNUSEDATTHEEND102", 777, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND103 = Field.create("UNUSEDATTHEEND103", 778, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND104 = Field.create("UNUSEDATTHEEND104", 779, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND105 = Field.create("UNUSEDATTHEEND105", 780, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND106 = Field.create("UNUSEDATTHEEND106", 781, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND107 = Field.create("UNUSEDATTHEEND107", 782, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND108 = Field.create("UNUSEDATTHEEND108", 783, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND109 = Field.create("UNUSEDATTHEEND109", 784, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND110 = Field.create("UNUSEDATTHEEND110", 785, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND111 = Field.create("UNUSEDATTHEEND111", 786, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND112 = Field.create("UNUSEDATTHEEND112", 787, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND113 = Field.create("UNUSEDATTHEEND113", 788, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND114 = Field.create("UNUSEDATTHEEND114", 789, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND115 = Field.create("UNUSEDATTHEEND115", 790, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND116 = Field.create("UNUSEDATTHEEND116", 791, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND117 = Field.create("UNUSEDATTHEEND117", 792, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND118 = Field.create("UNUSEDATTHEEND118", 793, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND119 = Field.create("UNUSEDATTHEEND119", 794, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND120 = Field.create("UNUSEDATTHEEND120", 795, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND121 = Field.create("UNUSEDATTHEEND121", 796, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND122 = Field.create("UNUSEDATTHEEND122", 797, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND123 = Field.create("UNUSEDATTHEEND123", 798, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND124 = Field.create("UNUSEDATTHEEND124", 799, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND125 = Field.create("UNUSEDATTHEEND125", 800, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND126 = Field.create("UNUSEDATTHEEND126", 801, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND127 = Field.create("UNUSEDATTHEEND127", 802, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND128 = Field.create("UNUSEDATTHEEND128", 803, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND129 = Field.create("UNUSEDATTHEEND129", 804, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND130 = Field.create("UNUSEDATTHEEND130", 805, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND131 = Field.create("UNUSEDATTHEEND131", 806, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND132 = Field.create("UNUSEDATTHEEND132", 807, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND133 = Field.create("UNUSEDATTHEEND133", 808, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND134 = Field.create("UNUSEDATTHEEND134", 809, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND135 = Field.create("UNUSEDATTHEEND135", 810, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND136 = Field.create("UNUSEDATTHEEND136", 811, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field[] VALUES = {
	SD_PRESENT,
	SD_LOGGING_INTERNAL,
	TRIGGERSCOPEREADY,
	ANTILAGTRIGGERED,
	ISFANON,
	ISO2HEATERON,
	CHECKENGINE,
	NEEDBURN,
	SD_MSD,
	ISFAN2ON,
	TOOTHLOGREADY,
	ISTPSERROR,
	ISCLTERROR,
	ISMAPERROR,
	ISIATERROR,
	ISTRIGGERERROR,
	HASCRITICALERROR,
	ISWARNNOW,
	ISPEDALERROR,
	ISKNOCKCHIPOK,
	LAUNCHTRIGGERED,
	ISTPS2ERROR,
	ISIDLECLOSEDLOOP,
	RPMVALUE,
	RPMACCELERATION,
	SPEEDTORPMRATIO,
	UNUSEDVEHICLESPEEDKPH,
	INTERNALMCUTEMPERATURE,
	COOLANT,
	INTAKE,
	AUXTEMP1,
	AUXTEMP2,
	TPSVALUE,
	THROTTLEPEDALPOSITION,
	TPSADC,
	RAWMAF,
	MAFMEASURED,
	MAPVALUE,
	BAROPRESSURE,
	LAMBDAVALUE,
	IDLECURRENTPOSITION,
	ALIGNMENTFILL_AT_37,
	VBATT,
	OILPRESSURE,
	VVTPOSITIONB1I,
	CHARGEAIRMASS,
	CRANKINGFUELMS,
	BASEFUEL,
	FUELRUNNING,
	ACTUALLASTINJECTION,
	INJECTORDUTYCYCLE,
	VEVALUE,
	INJECTIONOFFSET,
	TCHARGE,
	INJECTORLAGMS,
	ENGINEMAKECODENAMECRC16,
	WALLFUELAMOUNT,
	WALLFUELCORRECTIONVALUE,
	REVOLUTIONCOUNTERSINCESTART,
	DELTATPSVALUE,
	CANREADCOUNTER,
	TPSACCELFUEL,
	WARNINGCOUNTER,
	LASTERRORCODE,
	COILDUTYCYCLE,
	IDLEAIRVALVEPOSITION,
	ETBTARGET,
	ETB1DUTYCYCLE,
	FUELTANKLEVEL,
	TOTALFUELCONSUMPTION,
	FUELFLOWRATE,
	TPS2VALUE,
	TUNECRC16,
	ALIGNMENTFILL_AT_98,
	KNOCKLEVEL,
	SECONDS,
	ENGINEMODE,
	FIRMWAREVERSION,
	RAWIDLEPOSITIONSENSOR,
	RAWWASTEGATEPOSITION,
	ACCELERATIONX,
	ACCELERATIONY,
	TSCONFIGVERSION,
	CALIBRATIONVALUE,
	CALIBRATIONMODE,
	IDLETARGETPOSITION,
	DETECTEDGEAR,
	MAXTRIGGERREENTRANT,
	TOTALTRIGGERERRORCOUNTER,
	ORDERINGERRORCOUNTER,
	RECENTERRORCODE1,
	RECENTERRORCODE2,
	RECENTERRORCODE3,
	RECENTERRORCODE4,
	RECENTERRORCODE5,
	RECENTERRORCODE6,
	RECENTERRORCODE7,
	RECENTERRORCODE8,
	DEBUGFLOATFIELD1,
	DEBUGFLOATFIELD2,
	DEBUGFLOATFIELD3,
	DEBUGFLOATFIELD4,
	DEBUGFLOATFIELD5,
	DEBUGFLOATFIELD6,
	DEBUGFLOATFIELD7,
	DEBUGINTFIELD1,
	DEBUGINTFIELD2,
	DEBUGINTFIELD3,
	DEBUGINTFIELD4,
	DEBUGINTFIELD5,
	EGT1,
	EGT2,
	EGT3,
	EGT4,
	EGT5,
	EGT6,
	EGT7,
	EGT8,
	RAWTPS1PRIMARY,
	RAWPPSPRIMARY,
	RAWCLT,
	RAWIAT,
	RAWOILPRESSURE,
	FUELCLOSEDLOOPBINIDX,
	TCUCURRENTGEAR,
	RAWPPSSECONDARY,
	KNOCK1,
	KNOCK2,
	KNOCK3,
	KNOCK4,
	KNOCK5,
	KNOCK6,
	KNOCK7,
	KNOCK8,
	KNOCK9,
	KNOCK10,
	KNOCK11,
	KNOCK12,
	TCUDESIREDGEAR,
	FLEXPERCENT,
	WASTEGATEPOSITIONSENSOR,
	IDLEPOSITIONSENSOR,
	RAWLOWFUELPRESSURE,
	RAWHIGHFUELPRESSURE,
	LOWFUELPRESSURE,
	HIGHFUELPRESSURE,
	AFRVALUE,
	VSSACCELERATION,
	LAMBDAVALUE2,
	AFRVALUE2,
	VVTPOSITIONB1E,
	VVTPOSITIONB2I,
	VVTPOSITIONB2E,
	FUELPIDCORRECTION1,
	FUELPIDCORRECTION2,
	RAWTPS1SECONDARY,
	RAWTPS2PRIMARY,
	RAWTPS2SECONDARY,
	ACCELERATIONZ,
	ACCELERATIONROLL,
	ACCELERATIONYAW,
	VVTTARGETS1,
	VVTTARGETS2,
	VVTTARGETS3,
	VVTTARGETS4,
	TURBOSPEED,
	TPS1SPLIT,
	TPS2SPLIT,
	TPS12SPLIT,
	ACCPEDALSPLIT,
	SPARKCUTREASON,
	FUELCUTREASON,
	MAFESTIMATE,
	INSTANTRPM,
	SYSTEMEVENTREUSE,
	RAWMAP,
	RAWAFR,
	TPSACCELFROM,
	TPSACCELTO,
	ALIGNMENTFILL_AT_318,
	CALIBRATIONVALUE2,
	ISMAINRELAYON,
	ISUSBCONNECTED,
	LUAINVOCATIONCOUNTER,
	LUALASTCYCLEDURATION,
	TESTBENCHITER,
	TCU_CURRENTRANGE,
	TCRATIO,
	LASTSHIFTTIME,
	VSSEDGECOUNTER,
	ISSEDGECOUNTER,
	AUXLINEAR1,
	AUXLINEAR2,
	DFCOACTIVE,
	TPSACCELACTIVE,
	FALLBACKMAP,
	INSTANTMAPVALUE,
	MAXLOCKEDDURATION,
	CANWRITEOK,
	CANWRITENOTOK,
	ALIGNMENTFILL_AT_370,
	TRIGGERPRIMARYFALL,
	TRIGGERPRIMARYRISE,
	TRIGGERSECONDARYFALL,
	TRIGGERSECONDARYRISE,
	TRIGGERVVTFALL,
	TRIGGERVVTRISE,
	TRIGGERVVT2FALL,
	TRIGGERVVT2RISE,
	STARTERSTATE,
	STARTERRELAYDISABLE,
	MULTISPARKCOUNTER,
	EXTIOVERFLOWCOUNT,
	ALTERNATORSTATUS_PTERM,
	ALTERNATORSTATUS_ITERM,
	ALTERNATORSTATUS_DTERM,
	ALTERNATORSTATUS_OUTPUT,
	ALTERNATORSTATUS_ERROR,
	ALTERNATORSTATUS_RESETCOUNTER,
	IDLESTATUS_PTERM,
	IDLESTATUS_ITERM,
	IDLESTATUS_DTERM,
	IDLESTATUS_OUTPUT,
	IDLESTATUS_ERROR,
	IDLESTATUS_RESETCOUNTER,
	ETBSTATUS_PTERM,
	ETBSTATUS_ITERM,
	ETBSTATUS_DTERM,
	ETBSTATUS_OUTPUT,
	ETBSTATUS_ERROR,
	ETBSTATUS_RESETCOUNTER,
	BOOSTSTATUS_PTERM,
	BOOSTSTATUS_ITERM,
	BOOSTSTATUS_DTERM,
	BOOSTSTATUS_OUTPUT,
	BOOSTSTATUS_ERROR,
	BOOSTSTATUS_RESETCOUNTER,
	WASTEGATEDCSTATUS_PTERM,
	WASTEGATEDCSTATUS_ITERM,
	WASTEGATEDCSTATUS_DTERM,
	WASTEGATEDCSTATUS_OUTPUT,
	WASTEGATEDCSTATUS_ERROR,
	WASTEGATEDCSTATUS_RESETCOUNTER,
	VVTSTATUS1_PTERM,
	VVTSTATUS1_ITERM,
	VVTSTATUS1_DTERM,
	VVTSTATUS1_OUTPUT,
	VVTSTATUS1_ERROR,
	VVTSTATUS1_RESETCOUNTER,
	VVTSTATUS2_PTERM,
	VVTSTATUS2_ITERM,
	VVTSTATUS2_DTERM,
	VVTSTATUS2_OUTPUT,
	VVTSTATUS2_ERROR,
	VVTSTATUS2_RESETCOUNTER,
	VVTSTATUS3_PTERM,
	VVTSTATUS3_ITERM,
	VVTSTATUS3_DTERM,
	VVTSTATUS3_OUTPUT,
	VVTSTATUS3_ERROR,
	VVTSTATUS3_RESETCOUNTER,
	VVTSTATUS4_PTERM,
	VVTSTATUS4_ITERM,
	VVTSTATUS4_DTERM,
	VVTSTATUS4_OUTPUT,
	VVTSTATUS4_ERROR,
	VVTSTATUS4_RESETCOUNTER,
	AUXSPEED1,
	AUXSPEED2,
	ISSVALUE,
	RAWANALOGINPUT1,
	RAWANALOGINPUT2,
	RAWANALOGINPUT3,
	RAWANALOGINPUT4,
	RAWANALOGINPUT5,
	RAWANALOGINPUT6,
	RAWANALOGINPUT7,
	RAWANALOGINPUT8,
	GPPWMOUTPUT1,
	GPPWMOUTPUT2,
	GPPWMOUTPUT3,
	GPPWMOUTPUT4,
	GPPWMXAXIS1,
	GPPWMXAXIS2,
	GPPWMXAXIS3,
	GPPWMXAXIS4,
	GPPWMYAXIS1,
	GPPWMYAXIS2,
	GPPWMYAXIS3,
	GPPWMYAXIS4,
	RAWBATTERY,
	IGNBLENDPARAMETER1,
	IGNBLENDPARAMETER2,
	IGNBLENDPARAMETER3,
	IGNBLENDPARAMETER4,
	IGNBLENDBIAS1,
	IGNBLENDBIAS2,
	IGNBLENDBIAS3,
	IGNBLENDBIAS4,
	IGNBLENDOUTPUT1,
	IGNBLENDOUTPUT2,
	IGNBLENDOUTPUT3,
	IGNBLENDOUTPUT4,
	VEBLENDPARAMETER1,
	VEBLENDPARAMETER2,
	VEBLENDPARAMETER3,
	VEBLENDPARAMETER4,
	VEBLENDBIAS1,
	VEBLENDBIAS2,
	VEBLENDBIAS3,
	VEBLENDBIAS4,
	VEBLENDOUTPUT1,
	VEBLENDOUTPUT2,
	VEBLENDOUTPUT3,
	VEBLENDOUTPUT4,
	BOOSTOPENLOOPBLENDPARAMETER1,
	BOOSTOPENLOOPBLENDPARAMETER2,
	BOOSTOPENLOOPBLENDBIAS1,
	BOOSTOPENLOOPBLENDBIAS2,
	BOOSTOPENLOOPBLENDOUTPUT1,
	BOOSTOPENLOOPBLENDOUTPUT2,
	BOOSTCLOSEDLOOPBLENDPARAMETER1,
	BOOSTCLOSEDLOOPBLENDPARAMETER2,
	BOOSTCLOSEDLOOPBLENDBIAS1,
	BOOSTCLOSEDLOOPBLENDBIAS2,
	BOOSTCLOSEDLOOPBLENDOUTPUT1,
	BOOSTCLOSEDLOOPBLENDOUTPUT2,
	ALIGNMENTFILL_AT_646,
	COILSTATE1,
	COILSTATE2,
	COILSTATE3,
	COILSTATE4,
	COILSTATE5,
	COILSTATE6,
	COILSTATE7,
	COILSTATE8,
	COILSTATE9,
	COILSTATE10,
	COILSTATE11,
	COILSTATE12,
	INJECTORSTATE1,
	INJECTORSTATE2,
	INJECTORSTATE3,
	INJECTORSTATE4,
	INJECTORSTATE5,
	INJECTORSTATE6,
	INJECTORSTATE7,
	INJECTORSTATE8,
	INJECTORSTATE9,
	INJECTORSTATE10,
	INJECTORSTATE11,
	INJECTORSTATE12,
	TRIGGERCHANNEL1,
	TRIGGERCHANNEL2,
	VVTCHANNEL1,
	VVTCHANNEL2,
	VVTCHANNEL3,
	VVTCHANNEL4,
	OUTPUTREQUESTPERIOD,
	MAPFAST,
	LUAGAUGES1,
	LUAGAUGES2,
	RAWMAF2,
	MAFMEASURED2,
	SCHEDULINGUSEDCOUNT,
	VEHICLESPEEDKPH,
	UNUSEDATTHEEND1,
	UNUSEDATTHEEND2,
	UNUSEDATTHEEND3,
	UNUSEDATTHEEND4,
	UNUSEDATTHEEND5,
	UNUSEDATTHEEND6,
	UNUSEDATTHEEND7,
	UNUSEDATTHEEND8,
	UNUSEDATTHEEND9,
	UNUSEDATTHEEND10,
	UNUSEDATTHEEND11,
	UNUSEDATTHEEND12,
	UNUSEDATTHEEND13,
	UNUSEDATTHEEND14,
	UNUSEDATTHEEND15,
	UNUSEDATTHEEND16,
	UNUSEDATTHEEND17,
	UNUSEDATTHEEND18,
	UNUSEDATTHEEND19,
	UNUSEDATTHEEND20,
	UNUSEDATTHEEND21,
	UNUSEDATTHEEND22,
	UNUSEDATTHEEND23,
	UNUSEDATTHEEND24,
	UNUSEDATTHEEND25,
	UNUSEDATTHEEND26,
	UNUSEDATTHEEND27,
	UNUSEDATTHEEND28,
	UNUSEDATTHEEND29,
	UNUSEDATTHEEND30,
	UNUSEDATTHEEND31,
	UNUSEDATTHEEND32,
	UNUSEDATTHEEND33,
	UNUSEDATTHEEND34,
	UNUSEDATTHEEND35,
	UNUSEDATTHEEND36,
	UNUSEDATTHEEND37,
	UNUSEDATTHEEND38,
	UNUSEDATTHEEND39,
	UNUSEDATTHEEND40,
	UNUSEDATTHEEND41,
	UNUSEDATTHEEND42,
	UNUSEDATTHEEND43,
	UNUSEDATTHEEND44,
	UNUSEDATTHEEND45,
	UNUSEDATTHEEND46,
	UNUSEDATTHEEND47,
	UNUSEDATTHEEND48,
	UNUSEDATTHEEND49,
	UNUSEDATTHEEND50,
	UNUSEDATTHEEND51,
	UNUSEDATTHEEND52,
	UNUSEDATTHEEND53,
	UNUSEDATTHEEND54,
	UNUSEDATTHEEND55,
	UNUSEDATTHEEND56,
	UNUSEDATTHEEND57,
	UNUSEDATTHEEND58,
	UNUSEDATTHEEND59,
	UNUSEDATTHEEND60,
	UNUSEDATTHEEND61,
	UNUSEDATTHEEND62,
	UNUSEDATTHEEND63,
	UNUSEDATTHEEND64,
	UNUSEDATTHEEND65,
	UNUSEDATTHEEND66,
	UNUSEDATTHEEND67,
	UNUSEDATTHEEND68,
	UNUSEDATTHEEND69,
	UNUSEDATTHEEND70,
	UNUSEDATTHEEND71,
	UNUSEDATTHEEND72,
	UNUSEDATTHEEND73,
	UNUSEDATTHEEND74,
	UNUSEDATTHEEND75,
	UNUSEDATTHEEND76,
	UNUSEDATTHEEND77,
	UNUSEDATTHEEND78,
	UNUSEDATTHEEND79,
	UNUSEDATTHEEND80,
	UNUSEDATTHEEND81,
	UNUSEDATTHEEND82,
	UNUSEDATTHEEND83,
	UNUSEDATTHEEND84,
	UNUSEDATTHEEND85,
	UNUSEDATTHEEND86,
	UNUSEDATTHEEND87,
	UNUSEDATTHEEND88,
	UNUSEDATTHEEND89,
	UNUSEDATTHEEND90,
	UNUSEDATTHEEND91,
	UNUSEDATTHEEND92,
	UNUSEDATTHEEND93,
	UNUSEDATTHEEND94,
	UNUSEDATTHEEND95,
	UNUSEDATTHEEND96,
	UNUSEDATTHEEND97,
	UNUSEDATTHEEND98,
	UNUSEDATTHEEND99,
	UNUSEDATTHEEND100,
	UNUSEDATTHEEND101,
	UNUSEDATTHEEND102,
	UNUSEDATTHEEND103,
	UNUSEDATTHEEND104,
	UNUSEDATTHEEND105,
	UNUSEDATTHEEND106,
	UNUSEDATTHEEND107,
	UNUSEDATTHEEND108,
	UNUSEDATTHEEND109,
	UNUSEDATTHEEND110,
	UNUSEDATTHEEND111,
	UNUSEDATTHEEND112,
	UNUSEDATTHEEND113,
	UNUSEDATTHEEND114,
	UNUSEDATTHEEND115,
	UNUSEDATTHEEND116,
	UNUSEDATTHEEND117,
	UNUSEDATTHEEND118,
	UNUSEDATTHEEND119,
	UNUSEDATTHEEND120,
	UNUSEDATTHEEND121,
	UNUSEDATTHEEND122,
	UNUSEDATTHEEND123,
	UNUSEDATTHEEND124,
	UNUSEDATTHEEND125,
	UNUSEDATTHEEND126,
	UNUSEDATTHEEND127,
	UNUSEDATTHEEND128,
	UNUSEDATTHEEND129,
	UNUSEDATTHEEND130,
	UNUSEDATTHEEND131,
	UNUSEDATTHEEND132,
	UNUSEDATTHEEND133,
	UNUSEDATTHEEND134,
	UNUSEDATTHEEND135,
	UNUSEDATTHEEND136,
	};
}
