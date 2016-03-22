package org.openmrs.module.aijar.api.deploy.bundle;

import org.openmrs.module.aijar.metadata.core.EncounterTypes;
import org.openmrs.module.metadatadeploy.bundle.AbstractMetadataBundle;
import org.springframework.stereotype.Component;

/**
 * Created by ssmusoke on 06/01/2016.
 */
@Component
public class EncounterTypeMetadataBundle extends AbstractMetadataBundle {

    public void install() throws Exception {
        install(EncounterTypes.ART_SUMMARY_PAGE);
        install(EncounterTypes.EID_SUMMARY_PAGE);
        install(EncounterTypes.ART_ENCOUNTER_PAGE);
        install(EncounterTypes.EID_ENCOUNTER_PAGE);
        install(EncounterTypes.LAB_ENCOUNTER);
        install(EncounterTypes.HEALTH_EDUCATION);
        install(EncounterTypes.SMC_SUMMARY);
        install(EncounterTypes.ANC_ENCOUNTER);
        install(EncounterTypes.MATERNITY);
        install(EncounterTypes.HCT_ENCOUNTER);
    }
}
