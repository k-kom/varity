# Changelog

## [Unreleased]

### Added

- Support promoter on variant conversion. [#10](https://github.com/chrovis/varity/pull/10)

### Fixed

- Fix nonsense substitution in del case. [#9](https://github.com/chrovis/varity/pull/9)

## [0.3.7] - 2018-04-27

### Added

- Add benchmark code for liftover. [#8](https://github.com/chrovis/varity/pull/8)

### Changed

- Improve the performance of liftover. [#7](https://github.com/chrovis/varity/pull/7)
- Update dependencies:
    - cavia 0.5.0
    - commons-compress 1.16.1
    - proton 0.1.6

## [0.3.6] - 2018-02-06

### Added

- Add function to retrieve exon regions. [#4](https://github.com/chrovis/varity/pull/4)

### Changed

- Update dependencies:
    - commons-compress 1.16
    - proton 0.1.4

### Fixed

- Fix mistranslation from HGVS to vcf variant. [#5](https://github.com/chrovis/varity/pull/5)

## [0.3.5] - 2017-12-26

### Changed

- Parse scores and exon-frames in refGene.txt. [#3](https://github.com/chrovis/varity/pull/3)
- Update dependencies:
    - cavia 0.4.3
    - clj-hgvs 0.2.3
    - cljam 0.5.1
    - proton 0.1.3

### Fixed

- Fix incorrect conversion of nonsense substitution.

## [0.3.4] - 2017-08-21

### Changed

- Update cljam (0.4.1) and proton (0.1.2) version.

### Fixed

- Fix errors for some uncommon variants. [#2](https://github.com/chrovis/varity/pull/2)

## [0.3.3] - 2017-06-30

### Added

- Add tests.
- Support TwoBit format as reference sequence file.

### Fixed

- Fix the process of calculating alt protein sequence.

## [0.3.2] - 2017-06-15

### Changed

- Bump clj-hgvs version up to 0.2.0.

## [0.3.1] - 2017-05-15

### Changed

- Improve cDNA HGVS -> VCF variant support.
- ref-seq info can be used for HGVS -> VCF.
- Bump dependencies version up.

### Fixed

- Fix missed arguments.
- Fix arguments of lift in README.md. [#1](https://github.com/chrovis/varity/pull/1)
- Fix reflection/boxing warnings.

## [0.3.0] - 2017-05-08

### Added

- Normalize chromosome of VCF->HGVS inputs.

### Changed

- Use :chr instead of :chrom as chromosome of ref-gene.
- Use record as ref-gene index instead of map.
- Modify arguments of VCF<->HGVS.
- Modify arguments of lift.
- Bump clj-hgvs version up to 0.1.2.

## 0.2.0 - 2017-04-20

First release.

[Unreleased]: https://github.com/chrovis/varity/compare/0.3.7...HEAD
[0.3.7]: https://github.com/chrovis/varity/compare/0.3.6...0.3.7
[0.3.6]: https://github.com/chrovis/varity/compare/0.3.5...0.3.6
[0.3.5]: https://github.com/chrovis/varity/compare/0.3.4...0.3.5
[0.3.4]: https://github.com/chrovis/varity/compare/0.3.3...0.3.4
[0.3.3]: https://github.com/chrovis/varity/compare/0.3.2...0.3.3
[0.3.2]: https://github.com/chrovis/varity/compare/0.3.1...0.3.2
[0.3.1]: https://github.com/chrovis/varity/compare/0.3.0...0.3.1
[0.3.0]: https://github.com/chrovis/varity/compare/0.2.0...0.3.0