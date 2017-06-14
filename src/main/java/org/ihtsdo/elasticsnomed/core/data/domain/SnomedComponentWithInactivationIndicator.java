package org.ihtsdo.elasticsnomed.core.data.domain;

public interface SnomedComponentWithInactivationIndicator {
	String getInactivationIndicator();

	ReferenceSetMember getInactivationIndicatorMember();

	String getModuleId();

	String getId();

	void setInactivationIndicatorMember(ReferenceSetMember newIndicatorMember);
}
