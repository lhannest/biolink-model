# Class: molecular activity


An execution of a molecular function carried out by a gene product or macromolecular complex.

URI: [http://bioentity.io/vocab/MolecularActivity](http://bioentity.io/vocab/MolecularActivity)

![img](http://yuml.me/diagram/nofunky;dir:TB/class/\[MolecularActivity|id(i):identifier_type%20%3F;name(i):label_type%20%3F;category(i):label_type%20*;node_property(i):string%20%3F;iri(i):iri_type%20%3F;full_name(i):label_type%20%3F;description(i):narrative_text%20%3F;systematic_synonym(i):label_type%20%3F;has_phenotype(i):phenotype%20%3F]-%20precedes(i)%20%3F>\[Occurrent],%20\[MolecularActivity]-%20has%20input(i)%20%3F>\[NamedThing],%20\[MolecularActivity]-%20has%20participant(i)%20%3F>\[NamedThing],%20\[MolecularActivity]-%20regulates,%20process%20to%20process(i)%20%3F>\[Occurrent],%20\[MolecularActivity]-%20related%20to(i)%20%3F>\[NamedThing],%20\[MolecularActivity]-%20enabled%20by%20%3F>\[GeneOrGeneProduct],%20\[MacromolecularMachineToMolecularActivityAssociation]-%20object(i)>\[MolecularActivity],%20\[MolecularActivityToBiologicalProcessAssociation]-%20subject(i)>\[MolecularActivity],%20\[MolecularActivityToDownstreamMolecularActivityAssociation]-%20object(i)>\[MolecularActivity],%20\[MolecularActivityToDownstreamMolecularActivityAssociation]-%20subject(i)>\[MolecularActivity],%20\[MolecularActivityToGeneProductAssociation]-%20subject(i)>\[MolecularActivity],%20\[MolecularActivityToLocationAssociation]-%20subject(i)>\[MolecularActivity],%20\[MolecularActivity]uses%20-.->\[Occurrent],%20\[BiologicalProcessOrActivity]^-\[MolecularActivity])
## Mappings

 * [GO:0003674](http://purl.obolibrary.org/obo/GO_0003674)
## Inheritance

 *  is_a: [BiologicalProcessOrActivity](BiologicalProcessOrActivity.md) - Either an individual molecular activity, or a collection of causally connected molecular activities
 *  mixin: [Occurrent](Occurrent.md) - A processual entity
## Children

## Used in

 *  class: **[MacromolecularMachineToMolecularActivityAssociation](MacromolecularMachineToMolecularActivityAssociation.md)** *[macromolecular machine to molecular activity association.object](macromolecular_machine_to_molecular_activity_association_object.md)* **[MolecularActivity](MolecularActivity.md)**
 *  class: **[MolecularActivityToBiologicalProcessAssociation](MolecularActivityToBiologicalProcessAssociation.md)** *[molecular activity to biological process association.subject](molecular_activity_to_biological_process_association_subject.md)* **[MolecularActivity](MolecularActivity.md)**
 *  class: **[MolecularActivityToDownstreamMolecularActivityAssociation](MolecularActivityToDownstreamMolecularActivityAssociation.md)** *[molecular activity to downstream molecular activity association.object](molecular_activity_to_downstream_molecular_activity_association_object.md)* **[MolecularActivity](MolecularActivity.md)**
 *  class: **[MolecularActivityToDownstreamMolecularActivityAssociation](MolecularActivityToDownstreamMolecularActivityAssociation.md)** *[molecular activity to downstream molecular activity association.subject](molecular_activity_to_downstream_molecular_activity_association_subject.md)* **[MolecularActivity](MolecularActivity.md)**
 *  class: **[MolecularActivityToGeneProductAssociation](MolecularActivityToGeneProductAssociation.md)** *[molecular activity to gene product association.subject](molecular_activity_to_gene_product_association_subject.md)* **[MolecularActivity](MolecularActivity.md)**
 *  class: **[MolecularActivityToLocationAssociation](MolecularActivityToLocationAssociation.md)** *[molecular activity to location association.subject](molecular_activity_to_location_association_subject.md)* **[MolecularActivity](MolecularActivity.md)**
## Fields

 * [enabled by](enabled_by.md)
    * range: [GeneOrGeneProduct](GeneOrGeneProduct.md)
    * __Local__
 * [category](category.md) *subsets*: (translator_minimal)
    * Description: Name of the high level ontology class in which this entity is categorized. Corresponds to the label for the biolink entity type class. In a neo4j database this MAY correspond to the neo4j label tag
    * range: [LabelType](LabelType.md)*
    * inherited from: [NamedThing](NamedThing.md)
 * [description](description.md) *subsets*: (translator_minimal)
    * Description: a human-readable description of a thing
    * range: [NarrativeText](NarrativeText.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [full name](full_name.md)
    * Description: a long-form human readable name for a thing
    * range: [LabelType](LabelType.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [has input](has_input.md) *subsets*: (translator_minimal)
    * Description: holds between a process and a continuant, where the continuant is an input into the process
    * range: [NamedThing](NamedThing.md)
    * inherited from: [Occurrent](Occurrent.md)
 * [has participant](has_participant.md) *subsets*: (translator_minimal)
    * Description: holds between a process and a continuant, where the continuant is somehow involved in the process 
    * range: [NamedThing](NamedThing.md)
    * inherited from: [Occurrent](Occurrent.md)
 * [has phenotype](has_phenotype.md) *subsets*: (translator_minimal)
    * Description: holds between a biological entity and a phenotype, where a phenotype is construed broadly as any kind of quality of an organism part, a collection of these qualities, or a change in quality or qualities (e.g. abnormally increased temperature). 
    * range: [Phenotype](Phenotype.md)
    * inherited from: [BiologicalEntity](BiologicalEntity.md)
 * [id](id.md) *subsets*: (translator_minimal)
    * Description: A unique identifier for a thing. Must be either a CURIE shorthand for a URI or a complete URI
    * range: [IdentifierType](IdentifierType.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [iri](iri.md) *subsets*: (translator_minimal)
    * Description: An IRI for the node. This is determined by the id using expansion rules.
    * range: [IriType](IriType.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [name](name.md) *subsets*: (translator_minimal)
    * Description: A human-readable name for a thing
    * range: [LabelType](LabelType.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [node property](node_property.md)
    * Description: A grouping for any property that holds between a node and a value
    * range: **string**
    * inherited from: [NamedThing](NamedThing.md)
 * [precedes](precedes.md) *subsets*: (translator_minimal)
    * Description: holds between two processes, where one completes before the other begins
    * range: [Occurrent](Occurrent.md)
    * inherited from: [Occurrent](Occurrent.md)
 * [regulates, process to process](regulates_process_to_process.md) *subsets*: (translator_minimal)
    * Description: describes an entity that has a direct affect on the state or quality of another existing entity. Use of the 'affects' predicate implies that the affected entity already exists, unlike predicates such as 'affects risk for' and 'prevents, where the outcome is something that may or may not come to be.
    * range: [Occurrent](Occurrent.md)
    * inherited from: [Occurrent](Occurrent.md)
 * [related to](related_to.md)
    * Description: A grouping for any relationship type that holds between any two things
    * range: [NamedThing](NamedThing.md)
    * inherited from: [NamedThing](NamedThing.md)
 * [systematic synonym](systematic_synonym.md)
    * Description: more commonly used for gene symbols in yeast
    * range: [LabelType](LabelType.md)
    * inherited from: [NamedThing](NamedThing.md)
