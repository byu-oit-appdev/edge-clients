package edu.byu.edge.client.controldates.domain;

public enum ControlDateType {
	FIRST_BLOCK_ADD("1ST BLOCK ADD"),
	DISCONTINUANCE_DEADLINE("DISCONTINUANCE DEADLINE"),
	ORAL_SCHED_DEADLINE("ORAL_SCHED_DEADLINE"),
	RGNEWSEM("RGNEWSEM"),
	I20_1YEAR_COMP_DATE("I20 1YEAR COMP DATE"),
	CURRENT_YYT("CURRENT_YYT"),
	ENDORSEMENT_YEAR("ENDORSEMENT YEAR"),
	GRADUATION_DEADLINE("GRADUATION_DEADLINE"),
	UNIVERSITY_COMMENCEMENT("UNIVERSITY COMMENCEMENT"),
	FIRST_BLOCK_WITHDRAW("1ST BLOCK WITHDRAW"),
	CURRICULUM("CURRICULUM"),
	DISPLAY_YRT_BLACKBOARD_CMU("DISPLAY_YRT_BLACKBOARD_CMU"),
	DOCT_I20_COMP_DATE("DOCT_I20_COMP_DATE"),
	LIB_BINDING_DEADLINE("LIB_BINDING_DEADLINE"),
	MAST_I20_COMP_DATE("MAST_I20_COMP_DATE"),
	FINAL_DATES("FINAL_DATES"),
	OCH_FACILITY_APPROVAL("OCH FACILITY APPROVAL"),
	OGS_APP_DEADLINE("OGS_APP_DEADLINE"),
	BYU_IDAHO_SEMESTER_DATES("BYU IDAHO SEMESTER DATES"),
	DEGREE("DEGREE"),
	DISSERTATION_THESIS_PROJ_DATE("DISSERTATION THESIS PROJ DATE"),
	OCH_ADDRESS_FEE("OCH ADDRESS FEE"),
	OCH_LANDLORD_VERIFY_BEGIN("OCH LANDLORD VERIFY BEGIN"),
	OCH_LANDLORD_VERIFY_FEE("OCH LANDLORD VERIFY FEE"),
	TUITION_DUE("TUITION_DUE"),
	WDROPEND("WDROPEND"),
	GRAD_APP_DEADLINE("GRAD_APP_DEADLINE"),
	ORAL_EXAM_DEADLINE("ORAL_EXAM_DEADLINE"),
	GRADES("GRADES"),
	GRADUATION_APP_DEADLINE("GRADUATION APP DEADLINE"),
	OCH_DEFAULT_WAIVER("OCH DEFAULT WAIVER"),
	ID_CARD_EXP_BLACKOUT("ID CARD EXP BLACKOUT"),
	SECOND_BLOCK_WITHDRAW("2ND BLOCK WITHDRAW"),
	CONVOCATION_DATE("CONVOCATION DATE"),
	OCH_ADDRESS_DEADLINE("OCH ADDRESS DEADLINE"),
	OGS_DEPT_DECISION_DEADLINE("OGS_DEPT_DECISION_DEADLINE"),
	SEMESTER("SEMESTER"),
	SEMESTER_WITHDRAW("SEMESTER WITHDRAW"),
	OCH_LANDLORD_VERIFY("OCH LANDLORD VERIFY"),
	CLASS_BLOCK1("CLASS BLOCK1"),
	GRAD_REQS_DEADLINE("GRAD_REQS_DEADLINE"),
	OCH_WAIVER_APPLICATION("OCH WAIVER APPLICATION"),
	REGISTRATION("REGISTRATION"),
	CLASS_DATES("CLASS_DATES"),
	SECOND_BLOCK_ADD("2ND BLOCK ADD"),
	OCH_LANDLORD_VERIFY_REMINDER("OCH LANDLORD VERIFY REMINDER"),
	OCH_SEND_NOTICE("OCH SEND NOTICE"),
	SP_DISPLAY("SP DISPLAY"),
	PUBLIC_VIEW("PUBLIC_VIEW"),
	CLASS_BLOCK2("CLASS BLOCK2");

	private String controlDateType;

	ControlDateType(String controlDateType) {
		this.controlDateType = controlDateType;
	}

	/**
	 * See {@link ControlDateType#controlDateType}
	 * 
	 * @return the controlDateType
	 */
	public String getControlDateType() {
		return controlDateType;
	}
}